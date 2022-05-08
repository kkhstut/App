package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private App app;

    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    @DisplayName("Test Say Hello")
    public void testSayHello() {
        assertEquals("Hello", app.sayHello());
    }
}