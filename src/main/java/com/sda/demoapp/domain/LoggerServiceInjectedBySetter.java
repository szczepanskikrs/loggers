package com.sda.demoapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LoggerServiceInjectedBySetter implements SpringLoggerService {
    private StarterLogger starterLogger;

    @PostConstruct
    public void sayMyName(){
        logStuff("From LoggerServiceInjectedBySetter");
        logStuff(String.valueOf(starterLogger.hashCode()));
    }

    @Autowired
    public void setStarterLogger(StarterLogger starterLogger) {
        this.starterLogger = starterLogger;
    }

    @Override
    public void logStuff(String message) {
        starterLogger.logMessage(message);
    }
}

/**
 * AVOID!
 */