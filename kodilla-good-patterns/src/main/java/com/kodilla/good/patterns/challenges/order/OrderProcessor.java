package com.kodilla.good.patterns.challenges.order;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService,
                          OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);
        if(isOrdered) {
            informationService.inform(orderRequest.getInvoice().getUser());
            orderRepository.createOrder(orderRequest, true);
            return new OrderDto(orderRequest, true);
        } else {
            return new OrderDto(orderRequest, false);
        }
    }
}
