package org.labexercise.demo.simpleIntegrationTesting.orderImpl;

import org.labexercise.demo.unitTesting.orderSerivce.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl {
    @Autowired
    private OrderRepositoryJpa orderRepositoryJpa;

    public OrderEntity saveOrder(Order order)   {
        OrderEntity order1 = new OrderEntity();
        order1.setOrderAmount(order.getAmount());
        order1.setName(order.getName());
        return orderRepositoryJpa.save(order1);
    }

    public OrderEntity getOrderById(long id) {
        return orderRepositoryJpa.findById(id).orElse(null);
    }
}
