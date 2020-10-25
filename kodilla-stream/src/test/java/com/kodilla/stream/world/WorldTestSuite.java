package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        // Given
        World world = new World();
        // list of countries...
        Continent Europe = new Continent("Europe");
        Europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        Europe.addCountry(new Country("Germany", new BigDecimal("80000000")));
        Europe.addCountry(new Country("France", new BigDecimal("67000000")));
        Europe.addCountry(new Country("Great Britain", new BigDecimal("65000000")));
        Europe.addCountry(new Country("Italy", new BigDecimal("62000000")));
        Continent Asia = new Continent("Asia");
        Asia.addCountry(new Country("China", new BigDecimal("1400000000")));
        Asia.addCountry(new Country("India", new BigDecimal("1100000000")));
        Asia.addCountry(new Country("Indonesia", new BigDecimal("262000000")));
        Asia.addCountry(new Country("Pakistan", new BigDecimal("207000000")));
        Asia.addCountry(new Country("Japan", new BigDecimal("126000000")));
        world.addContinent(Europe);
        world.addContinent(Asia);

        // When
        BigDecimal people = world.getPeopleQuantity();

        // Then
        assertEquals(new BigDecimal("3407000000"), people);

    }
}
