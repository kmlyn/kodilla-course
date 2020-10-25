package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        // Given
        int[] array = IntStream.rangeClosed(11, 30).toArray();

        // When
        double average = ArrayOperations.getAverage(array);

        // Then
        assertEquals(20.5, average, 0.01);
    }
}
