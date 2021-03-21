package com.kodilla.good.patterns.challenges.order;

import java.math.BigDecimal;

public class InvoiceItem {
    private Product product;
    private int quantity;
    private BigDecimal value;

    public InvoiceItem(Product product, int quantity, BigDecimal value) {
        this.product = product;
        this.quantity = quantity;
        this.value = value;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getValue() {
        return value;
    }
}
