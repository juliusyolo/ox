package com.juliusyolo.ox.user.service.impl;

import com.juliusyolo.ox.user.repository.UserRepository;
import com.juliusyolo.ox.user.service.UserService;
import com.juliusyolo.ox.user.service.converter.UserConverter;
import com.juliusyolo.ox.user.service.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * <p>
 * UserServiceImpl description
 * </p>
 *
 * @author gesi.julius
 * @version : UserServiceImpl v0.1
 */
@Service
public class UserServiceImpl implements UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<UserModel> getUserByUsername(String username) {
        return userRepository.findByUsername(username).map(UserConverter.INSTANCE::convert);
    }

    @Override
    public Mono<UserModel> registerUser(UserModel userModel) {
        return userRepository.save(UserConverter.INSTANCE.convert(userModel)).map(UserConverter.INSTANCE::convert);
    }
}