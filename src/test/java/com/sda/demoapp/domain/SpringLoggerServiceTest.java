package com.sda.demoapp.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@Import(LoggerTestConfiguration.class)
class SpringLoggerServiceTest {
    @Autowired
    private LoggerServiceInjectConstructor service;

    @Autowired
    private TestStarterLogger logger;

    @Test
    void shouldSendMessageToOutput() {
        // Given / Arrange
        var message = "Test Message";

        // When / Action
        service.logStuff(message);

        // Then / Assert
        assertThat(logger.getCapturedOutput().size()).isEqualTo(3);
        assertThat(logger.getCapturedOutput().contains(message)).isTrue();
    }
}