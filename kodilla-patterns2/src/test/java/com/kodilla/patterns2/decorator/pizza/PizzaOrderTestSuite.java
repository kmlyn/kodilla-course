package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaGetPrice() {
        //Given
        Pizza pizza = new Margherita();
        pizza = new SausageDecorator(pizza);
        pizza = new FetaDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);

        //When
        //Then
        assertEquals(new BigDecimal(26.5), pizza.getCost());
    }

    @Test
    public void testPizzaGetDescription() {
        //Given
        Pizza pizza = new Margherita();
        pizza = new SausageDecorator(pizza);
        pizza = new FetaDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);

        //When & then
        assertEquals("Pizza with sauce and cheese, with sausage, with feta, with mushrooms, with extra cheese",
                pizza.getDescription());
    }
}
