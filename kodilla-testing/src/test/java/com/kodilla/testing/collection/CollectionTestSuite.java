package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void start() {
        System.out.println("Starting a new test case");
    }

    @AfterEach
    public void stop() {
        System.out.println("Finished a test case");
    }

    @DisplayName("When given an empty list, another empty list should be returned")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = List.of();
        OddNumbersExterminator one = new OddNumbersExterminator();

        //When
        List<Integer> result = one.exterminate(emptyList);

        //Then
        Assertions.assertEquals(0, result.size());
    }

    @DisplayName("When given a normal list, only even numbers should be returned")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> theList = List.of(1,2,3,4,5,6,7);
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> expected = List.of(2, 4, 6);

        //When
        List<Integer> result = one.exterminate(theList);

        //Then
        Assertions.assertEquals(expected, result);
    }
}
