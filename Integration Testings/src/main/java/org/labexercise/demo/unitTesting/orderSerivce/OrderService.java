package org.labexercise.demo.unitTesting.orderSerivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        try {
            orderRepository.save(order);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Order could not be saved... \nSorry, Try again!");
        }
        return order;
    }

    public Order getOrderById(String id) {
        return orderRepository.getOrder(id);
    }
}
