package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal quantity;
    private final String name;

    public Country(String name, BigDecimal quantity) {
        this.quantity = quantity;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity() {
        return quantity;
    }
}
