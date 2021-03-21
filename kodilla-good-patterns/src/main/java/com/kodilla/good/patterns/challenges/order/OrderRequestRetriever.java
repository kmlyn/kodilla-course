package com.kodilla.good.patterns.challenges.order;

import java.math.BigDecimal;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("jsmith", "jsmith@wp.pl");
        Invoice invoice = new Invoice("1", user);
        OrderRequest orderRequest = new OrderRequest("1", invoice);
        invoice.getItems().add(new InvoiceItem(
                new Product("Keyboard", new BigDecimal(100)), 1, new BigDecimal(100))
        );
        invoice.getItems().add(new InvoiceItem(
                new Product("Mouse", new BigDecimal(40)), 1, new BigDecimal(40))
        );
        orderRequest.setInvoice(invoice);
        return orderRequest;
    }
}
