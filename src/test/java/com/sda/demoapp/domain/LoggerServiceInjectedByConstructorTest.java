package com.sda.demoapp.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoggerServiceInjectedByConstructorTest {
    @Test
    void shouldSendToOutput() {
        // Given
        var testStarterLogger = new TestStarterLogger();
        var systemUnderTest = new LoggerServiceInjectConstructor(testStarterLogger);
        var expectedMessage = "INJECT!";
        // When
        systemUnderTest.logStuff(expectedMessage);

        // Then
        assertThat(testStarterLogger.getCapturedOutput().contains(expectedMessage)).isTrue();
    }
}
