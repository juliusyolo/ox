package com.juliusyolo.ox.user.service;

import com.juliusyolo.ox.user.service.model.UserModel;
import reactor.core.publisher.Mono;

/**
 * <p>
 * UserService description
 * </p>
 *
 * @author gesi.julius
 * @version : UserService v0.1
 */
public interface UserService {
    /**
     * 根据用户名获取用户
     * @param username 用户名
     * @return 用户
     */
    Mono<UserModel> getUserByUsername(String username);

    /**
     * 注册用户
     * @param userModel 用户信息
     * @return 用户
     */
    Mono<UserModel> registerUser(UserModel userModel);
}
