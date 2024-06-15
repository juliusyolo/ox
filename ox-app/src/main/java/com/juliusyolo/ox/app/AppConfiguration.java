package com.juliusyolo.ox.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

/**
 * @author Julius Wang
 * <p>
 * AppConfiguration
 * <p>
 * @since v0.1
 */
@Configuration
public class AppConfiguration extends ElasticsearchConfiguration {
    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo("192.168.71.73:9200")
                .usingSsl("08f7afe4ff3507ef59d50ee52563349879eb640ee9bfa8dbc58e5e2064ac1441")
                .withBasicAuth("elastic", "4dS0Yn7UXyON*eYvISa=")
                .build();
    }
}
