package com.sda.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }
}

/**
 * 1. Odpala się main
 * 2. SpringBootApplication.run
 * 3. Sprawdza co jest na classpath
 * 4. Wczytaj autokonfiguracje
 * 5. Stwórz beany z autoconfiguracji.
 * 6. Przeskanuj komponenty
 * 7. Tworzy instancje komponentów
 */
