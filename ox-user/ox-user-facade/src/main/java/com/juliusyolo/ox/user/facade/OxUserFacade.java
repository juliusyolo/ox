package com.juliusyolo.ox.user.facade;


import com.juliusyolo.ox.common.model.OxResult;
import com.juliusyolo.ox.user.facade.model.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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

}
