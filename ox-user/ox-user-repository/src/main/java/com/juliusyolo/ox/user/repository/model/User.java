package com.juliusyolo.ox.user.repository.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

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
public class User {
    @Id
    private Long id;

    private String nickName;

    private String userName;

    private String password;

    private String email;

    private String phoneNumber;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
