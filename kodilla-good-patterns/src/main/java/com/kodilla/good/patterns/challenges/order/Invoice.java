package com.kodilla.good.patterns.challenges.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String number;
    private User user;
    private BigDecimal total;
    private List<InvoiceItem> items = new ArrayList<>();

    public Invoice(String number, User user) {
        this.number = number;
        this.user = user;
        this.total = new BigDecimal(0);
    }

    private void computeTotal() {
        BigDecimal temp = new BigDecimal(0);
        for (InvoiceItem it :
                items) {
            temp = temp.add(it.getValue());
        }
        total = temp;
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getTotal() {
        computeTotal();
        return total;
    }

    public String getNumber() {
        return number;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }
}
