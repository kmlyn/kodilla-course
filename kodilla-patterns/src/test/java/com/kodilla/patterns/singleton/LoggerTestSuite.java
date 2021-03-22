package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    @Test
    public void testLog() {
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("Test written");

        //Then
        assertEquals("Test written", logger.getLastLog());
    }
}
