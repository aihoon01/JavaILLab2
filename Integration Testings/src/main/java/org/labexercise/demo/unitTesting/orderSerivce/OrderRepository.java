package org.labexercise.demo.unitTesting.orderSerivce;

import org.springframework.stereotype.Repository;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository {
    private Map<String, Order> orders;
    public OrderRepository() {
        orders = new HashMap<>();
    }

    public Map<String, Order> getOrders() {
        return orders;
    }

    public Order save(Order order) throws NoSuchAlgorithmException {
        String id = java.util.Base64.getEncoder().encodeToString(new java.security.SecureRandom().generateSeed(32));
        orders.put(id, order);
        System.out.println("Order added successfully. \nOrder Id:  " + id);
        return order;
    }

    public Order getOrder(String id) {
        return orders.get(id);
    }
}
