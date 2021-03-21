package com.kodilla.good.patterns.challenges.order;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(OrderRequest orderRequest, boolean isOrdered) {
        System.out.println("Create order in database");
        return true;
    }
}
