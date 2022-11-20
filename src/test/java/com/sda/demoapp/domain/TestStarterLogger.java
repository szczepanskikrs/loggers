package com.sda.demoapp.domain;

import java.util.ArrayList;
import java.util.List;

public class TestStarterLogger implements StarterLogger {
    private final List<String> capturedOutput = new ArrayList<String>();

    @Override
    public void logMessage(String message) {
        capturedOutput.add(message);
    }

    public List<String> getCapturedOutput() {
        return capturedOutput;
    }
}
