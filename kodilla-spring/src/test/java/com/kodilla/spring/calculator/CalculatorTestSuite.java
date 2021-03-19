package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calc;

    @Test
    public void testCalculations() {
        //Given
        //When & Then
        assertEquals(calc.add(1.0, 4.5), 5.5);
        assertEquals(calc.sub(4.5, 5.5), -1.0);
        assertEquals(calc.mul(2.0, 3.5), 7.0);
        assertEquals(calc.div(5.0, 2.5), 2.0);
    }
}
