package com.juliusyolo.ox.user.service.model;

import com.juliusyolo.ox.common.utils.OxUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * <p>
 * UserModel description
 * </p>
 *
 * @author gesi.julius
 * @version : UserModel v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private Long id;

    private Long userId;

    private String nickname;

    private String username;

    private String password;

    private String email;

    private String phoneNumber;

    private String avatarUrl;

    private String refreshToken;

    private String accessToken;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public String getAccessToken() {
        if (StringUtils.isNotBlank(accessToken)) {
            return accessToken;
        }
        return OxUtils.Jwt.generateSessionToken("access",
                Map.of(  "username", username, "password", password));
    }

    public String getRefreshToken() {
        if (StringUtils.isNotBlank(refreshToken)) {
            return refreshToken;
        }
        return OxUtils.Jwt.generateSessionToken("refresh",
                Map.of(  "username", username, "password", password));
    }
}
