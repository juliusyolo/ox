package com.juliusyolo.ox.user.service.impl;

import com.juliusyolo.ox.common.OxException;
import com.juliusyolo.ox.user.repository.UserRepository;
import com.juliusyolo.ox.user.repository.model.User;
import com.juliusyolo.ox.user.service.UserService;
import com.juliusyolo.ox.user.service.UserStatusEnum;
import com.juliusyolo.ox.user.service.converter.UserConverter;
import com.juliusyolo.ox.user.service.model.UserModel;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * <p>
 * UserServiceImpl description
 * </p>
 *
 * @author gesi.julius
 * @version : UserServiceImpl v0.1
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    @Override
    public Mono<UserModel> getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .switchIfEmpty(Mono.error(new OxException(UserStatusEnum.USER_NOT_EXIST)))
                .map(UserConverter.INSTANCE::convert);
    }

    @Override
    public Mono<UserModel> registerUser(UserModel userModel) {
        return userRepository.findByUsername(userModel.getUsername())
                .mapNotNull(user -> {
                    if (Objects.nonNull(user)) {
                        throw new OxException(UserStatusEnum.USERNAME_ALREADY_REGISTERED);
                    }
                    return null;
                })
                .switchIfEmpty(userRepository.findByEmail(userModel.getEmail())).mapNotNull(user -> {
                    if (Objects.nonNull(user)) {
                        throw new OxException(UserStatusEnum.EMAIL_ALREADY_REGISTERED);
                    }
                    return null;
                })
                .switchIfEmpty(userRepository.save(UserConverter.INSTANCE.convert(userModel)))
                .cast(User.class)
                .map(UserConverter.INSTANCE::convert);

    }

    @Override
    public Mono<UserModel> getUserByUsernameOrEmail(UserModel userModel) {
        return userRepository.findByUsernameOrEmail(UserConverter.INSTANCE.convert(userModel))
                .switchIfEmpty(Mono.error(new OxException(UserStatusEnum.USER_NOT_EXIST)))
                .map(UserConverter.INSTANCE::convert);
    }

    @Override
    public Mono<UserModel> login(UserModel userModel) {
        return userRepository.findByUsernameOrEmailAndPassword(UserConverter.INSTANCE.convert(userModel))
                .switchIfEmpty(Mono.error(new OxException(UserStatusEnum.USER_NOT_EXIST)))
                .map(user -> {
                    user.setAccessToken(userModel.getAccessToken());
                    user.setRefreshToken(userModel.getRefreshToken());
                    return user;
                })
                .flatMap(userRepository::updateLoginInfo)
                .flatMap(effectRow -> {
                    if (effectRow == 1) {
                        return userRepository.findByUsernameOrEmailAndPassword(UserConverter.INSTANCE.convert(userModel));
                    }
                    return Mono.error(new OxException(UserStatusEnum.LOGIN_STATUS_RECORD_ERROR));
                })
                .map(UserConverter.INSTANCE::convert);
    }

    @Override
    public Mono<UserModel> getUserByUserId(Long userId) {
        return userRepository.findByUserId(userId).map(UserConverter.INSTANCE::convert);
    }
}
