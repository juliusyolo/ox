package com.juliusyolo.ox.user.facade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Julius Wang
 * <p>
 * 用户登录VO
 * <p>
 * @since v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginVO {
    private String refreshToken;
    private String accessToken;
    private String username;
    private String nickname;
    private String avatarUrl;
}
