package com.val.mch.opentelemetry.Service1.config.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Logbook;

@Configuration
public class LogbookConfig {

    @Bean
    public Logbook logbook()
    {
        return Logbook.create();
    }
}
