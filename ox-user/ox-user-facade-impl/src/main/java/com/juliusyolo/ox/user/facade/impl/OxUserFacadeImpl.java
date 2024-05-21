package com.juliusyolo.ox.user.facade.impl;

import com.juliusyolo.ox.common.model.OxResult;
import com.juliusyolo.ox.user.facade.OxUserFacade;
import com.juliusyolo.ox.user.facade.model.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Override
    @GetMapping("/api/v1/users/hello")
    public Mono<OxResult<UserVO>> hello() {
        return Mono.just(new OxResult<>(new UserVO("hello,为语")));
    }

}
