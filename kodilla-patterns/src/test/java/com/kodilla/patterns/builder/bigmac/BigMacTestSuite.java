package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {
    @Test
    public void testBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(BigMacBun.WITH_SESAME)
                .addBurger()
                .addIngredient(BigMacIngredient.BACON)
                .addIngredient(BigMacIngredient.CHEESE)
                .addIngredient(BigMacIngredient.CUCUMBER)
                .sauce(BigMacSauce.BARBECUE).build();
        //When
        //Then
        assertEquals(2, bigMac.getBurgers());
        assertEquals(3, bigMac.getIngredients().size());
        assertEquals(BigMacBun.class, bigMac.getBun().getClass());
        assertEquals(BigMacSauce.class, bigMac.getSauce().getClass());
    }
}
