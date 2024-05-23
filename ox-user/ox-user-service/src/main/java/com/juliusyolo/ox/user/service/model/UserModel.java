package com.juliusyolo.ox.user.service.model;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private String nickName;

    private String userName;

    private String password;

    private String email;

    private String phoneNumber;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
