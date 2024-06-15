package com.juliusyolo.ox.user.facade.impl;

import com.juliusyolo.ox.common.model.OxResult;
import com.juliusyolo.ox.user.facade.OxUserFacade;
import com.juliusyolo.ox.user.facade.converter.UserVOConverter;
import com.juliusyolo.ox.user.facade.model.UserLoginVO;
import com.juliusyolo.ox.user.facade.model.UserVO;
import com.juliusyolo.ox.user.facade.model.request.UserLoginRequest;
import com.juliusyolo.ox.user.facade.model.request.UserRegisterRequest;
import com.juliusyolo.ox.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * <p>
 * OxUserFacadeImpl description
 * </p>
 *
 * @author gesi.julius
 * @version : OxUserFacadeImpl v0.1
 */
@RestController
@AllArgsConstructor
public class OxUserFacadeImpl implements OxUserFacade {

    private final UserService userService;

    @Override
    @GetMapping("/api/v1/user/{username}")
    public Mono<OxResult<UserVO>> getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username).map(UserVOConverter.INSTANCE::convert).map(OxResult::ok);
    }

    @Override
    @PostMapping("/api/v1/user/register")
    public Mono<OxResult<UserVO>> registerUser(@RequestBody UserRegisterRequest request) {
        return userService.registerUser(UserVOConverter.INSTANCE.convert(request)).map(UserVOConverter.INSTANCE::convert).map(OxResult::ok);
    }

    @Override
    @PostMapping("/api/v1/user/login")
    public Mono<OxResult<UserLoginVO>> login(@RequestBody UserLoginRequest request) {
        return userService.login(UserVOConverter.INSTANCE.convert(request)).map(UserVOConverter.INSTANCE::convertUserLoginVO).map(OxResult::ok);
    }

}
