package com.juliusyolo.ox.user.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

/**
 * @author Julius Wang
 * <p>
 * UserConfiguration
 * <p>
 * @since v0.1
 */
@Configuration
@EnableR2dbcRepositories(basePackages = "com.juliusyolo.ox.user.repository")
public class UserConfiguration {
}
