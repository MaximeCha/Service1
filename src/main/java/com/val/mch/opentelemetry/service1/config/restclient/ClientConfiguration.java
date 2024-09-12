package com.val.mch.opentelemetry.service1.config.restclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientConfiguration {

    @Bean
    public RestClient restTemplate() {
        return RestClient.create();
    }

}
