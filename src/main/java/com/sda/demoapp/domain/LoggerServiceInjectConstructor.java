package com.sda.demoapp.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LoggerServiceInjectConstructor implements SpringLoggerService {
    private final StarterLogger logger;

    @PostConstruct
    public void sayMyName(){
        logStuff("From LoggerServiceInjectConstructor");
        logStuff(String.valueOf(logger.hashCode()));
    }
    public LoggerServiceInjectConstructor(StarterLogger logger) {
        this.logger = logger;
    }

    @Override
    public void logStuff(String message) {
        logger.logMessage(message);
    }
}
/**
 * APPROVED!
 */