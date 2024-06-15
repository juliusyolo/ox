package com.juliusyolo.ox.user.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

/**
 * <p>
 * User 用户实体类
 * </p>
 *
 * @author gesi.julius
 * @version : User v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table
public class User {
    @Id
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
}
