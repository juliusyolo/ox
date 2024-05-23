package com.juliusyolo.ox.user.facade.impl;

import com.juliusyolo.ox.common.model.OxResult;
import com.juliusyolo.ox.user.facade.OxUserFacade;
import com.juliusyolo.ox.user.facade.converter.UserVOConverter;
import com.juliusyolo.ox.user.facade.model.UserVO;
import com.juliusyolo.ox.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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
public class OxUserFacadeImpl implements OxUserFacade {

    private final UserService userService;

    public OxUserFacadeImpl(@Autowired UserService userService) {
        this.userService = userService;
    }

    @Override
    @GetMapping("/api/v1/user/{username}")
    public Mono<OxResult<UserVO>> getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username).map(UserVOConverter.INSTANCE::convert).map(OxResult::ok);
    }

}
