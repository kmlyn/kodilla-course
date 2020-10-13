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
        List<Integer> l = Arrays.asList();

        //When
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> result = one.exterminate(l);

        //Then
        Assertions.assertEquals(0, result.size());
    }

    @DisplayName("When given a normal list, only even numbers should be returned")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);

        //When
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> result = one.exterminate(l);

        //Then
        List<Integer> expected = Arrays.asList(2,4,6);
        Assertions.assertEquals(3, result.size());
        Assertions.assertArrayEquals(expected.toArray(), result.toArray());
    }
}
