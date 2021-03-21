package com.kodilla.good.patterns.challenges.order;

public interface OrderRepository {
    boolean createOrder(OrderRequest orderRequest, boolean isOrdered);
}
