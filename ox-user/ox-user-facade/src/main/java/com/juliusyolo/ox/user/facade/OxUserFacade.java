package com.juliusyolo.ox.user.facade;


import com.juliusyolo.ox.common.model.OxResult;
import com.juliusyolo.ox.user.facade.model.UserLoginVO;
import com.juliusyolo.ox.user.facade.model.UserVO;
import com.juliusyolo.ox.user.facade.model.request.UserLoginRequest;
import com.juliusyolo.ox.user.facade.model.request.UserRegisterRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * <p>
 * OxUserFacade description
 * </p>
 *
 * @author gesi.julius
 * @version : OxUserFacade v0.1
 */
@RestController
public interface OxUserFacade {

    @GetMapping("/api/v1/user/{username}")
    Mono<OxResult<UserVO>> getUserByUsername(@PathVariable("username") String username);

    @PostMapping("/api/v1/user/register")
    Mono<OxResult<UserVO>> registerUser(@RequestBody UserRegisterRequest request);

    @PostMapping("/api/v1/user/login")
    Mono<OxResult<UserLoginVO>> login(@RequestBody UserLoginRequest request);

}
