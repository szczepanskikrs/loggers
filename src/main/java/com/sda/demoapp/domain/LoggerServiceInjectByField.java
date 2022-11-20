package com.sda.demoapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LoggerServiceInjectByField implements SpringLoggerService {

    @PostConstruct
    public void sayMyName(){
        logStuff("From LoggerServiceInjectByField");
        logStuff(String.valueOf(starterLogger.hashCode()));
    }

    @Autowired
    private StarterLogger starterLogger;

    @Override
    public void logStuff(String message) {
        starterLogger.logMessage(message);
    }
}

/**
 * NOPE! DONT DO THAT!
 */