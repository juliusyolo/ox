package com.juliusyolo.ox.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * <p>
 * OxSecurityConfiguration description
 * </p>
 *
 * @author gesi.julius
 * @version : OxSecurityConfiguration v0.1
 */
@Configuration
@EnableReactiveMethodSecurity
@EnableWebFluxSecurity
public class OxSecurityConfiguration {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity){

        return httpSecurity.csrf(ServerHttpSecurity.CsrfSpec::disable)
                .cors(ServerHttpSecurity.CorsSpec::disable)
                .build();

    }

}
