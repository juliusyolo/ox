package com.juliusyolo.ox.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.SecretKey;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

/**
 * @author Julius Wang
 * <p>
 * 工具类
 * <p>
 * @since v0.1
 */
public class OxUtils {

    public static String sha256(String input) {
        if (StringUtils.isBlank(input)) {
            return null;
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        messageDigest.update(input.getBytes());
        byte[] byteBuffer = messageDigest.digest();
        StringBuilder strHexString = new StringBuilder();
        for (byte b : byteBuffer) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                strHexString.append('0');
            }
            strHexString.append(hex);
        }
        return strHexString.toString();
    }

    public static class Jwt {
        public final static SecretKey KEY = Jwts.SIG.HS256.key().build();

        public String extractUsername(String token) {
            return extractClaim(token, Claims::getSubject);
        }

        public Date extractExpiration(String token) {
            return extractClaim(token, Claims::getExpiration);
        }

        public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
            final Claims claims = extractAllClaims(token);
            return claimsResolver.apply(claims);
        }

        public Claims extractAllClaims(String token) {
            return Jwts.parser().verifyWith(KEY).build().parseSignedClaims(token).getPayload();
        }

        public boolean isTokenExpired(String token) {
            return extractExpiration(token).before(new Date());
        }

        public static String generateJwtAuthenticateToken(String subject, Map<String, Object> claims) {
            return createToken(claims, subject, false);
        }

        public static String generateSessionToken(String subject, Map<String, Object> claims) {
            return createToken(claims, subject, true);
        }


        private static String createToken(Map<String, Object> claims, String subject, boolean isSessionToken) {

            return Jwts.builder()
                    .claims(claims)
                    .subject(subject)
                    .issuedAt(new Date(System.currentTimeMillis()))
                    .expiration(new Date(System.currentTimeMillis() + (isSessionToken ?
                           36000:36001)))
                    .signWith(KEY)
                    .compact();
        }

        public boolean validateToken(String token, String username) {
            final String tokenUsername = extractUsername(token);
            return username.equals(tokenUsername) && !isTokenExpired(token);
        }

//        public String encodeToToken(Authentication auth) {
//            IdmAuthenticateData idmAuthenticateData = (IdmAuthenticateData) auth.getDetails();
//            IdmAuthenticationOutData idmAuthenticationOutData = idmAuthenticateData.getIdmAuthenticationOutData();
//            UserInfo userInfo = idmAuthenticationOutData.getUserInfo();
//            Map<String, Object> claims = new HashMap<>(1);
//            claims.put("payload", userInfo);
//            return this.generateJwtAuthenticateToken(userInfo.getUserId(), claims);
//        }
//
//        public Authentication decodeToAuthentication(IdmAuthenticateData idmAuthenticateData) {
//            Claims claims;
//            try {
//                claims = this.extractAllClaims(idmAuthenticateData.getIdmAuthenticateInData().getToken());
//            } catch (ExpiredJwtException e) {
//                throw new BadCredentialsException("Expired token");
//            } catch (UnsupportedJwtException e) {
//                throw new BadCredentialsException("Unsupported token");
//            } catch (MalformedJwtException e) {
//                throw new BadCredentialsException("Malformed token");
//            } catch (SignatureException | IllegalArgumentException e) {
//                throw new BadCredentialsException("Invalid token");
//            }
//            return new IdmAuthenticationToken(idmAuthenticateData);
//        }
    }


    public static long uuid(){
        return Math.abs(UUID.randomUUID().toString().hashCode());
    }
}
