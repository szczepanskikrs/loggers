package com.sda.demoapp.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Primary
public class Slf4jStarterLogger implements StarterLogger {
    public void logMessage(String message) {
        log.info(message);
    }
}
