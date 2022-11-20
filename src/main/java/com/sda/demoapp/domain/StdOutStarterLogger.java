package com.sda.demoapp.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class StdOutStarterLogger implements StarterLogger {
    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
}
