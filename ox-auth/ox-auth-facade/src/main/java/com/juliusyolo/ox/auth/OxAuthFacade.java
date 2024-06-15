package com.juliusyolo.ox.auth;

import com.juliusyolo.ox.common.model.OxResult;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <p>
 * OxAuthFacade description
 * </p>
 *
 * @author gesi.julius
 * @version : OxAuthFacade v0.1
 */
@RestController
public interface OxAuthFacade {

    Mono<OxResult<String>> issueToken(String username, String password);
}
