package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final BigMacBun bun;
    private final int burgers;
    private final BigMacSauce sauce;
    private List<BigMacIngredient> ingredients = new ArrayList<>();

    private BigMac(BigMacBun bun, int burgers, BigMacSauce sauce, List<BigMacIngredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public BigMacBun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public BigMacSauce getSauce() {
        return sauce;
    }

    public List<BigMacIngredient> getIngredients() {
        return ingredients;
    }

    public static class BigMacBuilder {
        private BigMacBun bun;
        private int burgers;
        private BigMacSauce sauce;
        private List<BigMacIngredient> ingredients = new ArrayList<>();

        public BigMacBuilder() {
            burgers = 1;
        }

        public BigMacBuilder addBurger() throws IllegalStateException {
            ++burgers;
            if(burgers > 3)
                throw new IllegalStateException("Too many burgers (" + burgers + ")" );
            return this;
        }

        public BigMacBuilder bun(BigMacBun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder sauce(BigMacSauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder addIngredient(BigMacIngredient ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }
}
