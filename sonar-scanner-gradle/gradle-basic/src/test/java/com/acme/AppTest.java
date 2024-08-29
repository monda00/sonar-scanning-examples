package com.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testAppHasAGreetingWithName() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreetingWithName("Sam"), "app should have a greeting");
    }
}
