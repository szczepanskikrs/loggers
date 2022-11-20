package com.sda.demoapp.domain;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class LoggerTestConfiguration {

    @Bean
    public TestStarterLogger testStarterLogger() {
        return new TestStarterLogger();
    }

    @Bean
    @Primary
    public LoggerServiceInjectConstructor testLoggerServiceInjectConstructor(
            TestStarterLogger logger
    ) {
        return new LoggerServiceInjectConstructor(logger);
    }
}
