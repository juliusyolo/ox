package com.juliusyolo.ox.community.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

/**
 * @author Julius Wang
 * <p>
 * CommunityConfiguration
 * <p>
 * @since v0.1
 */
@Configuration
@EnableR2dbcRepositories(basePackages = "com.juliusyolo.ox.community.repository.db")
@EnableReactiveElasticsearchRepositories(basePackages = "com.juliusyolo.ox.community.repository.es")
public class CommunityConfiguration {
}
