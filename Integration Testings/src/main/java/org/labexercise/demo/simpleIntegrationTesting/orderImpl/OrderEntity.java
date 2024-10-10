package org.labexercise.demo.simpleIntegrationTesting.orderImpl;

import jakarta.persistence.*;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = true, nullable = false)
    private long orderId;

    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "amount", nullable = true)
    private int amount;


    public long getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return name;
    }

    public void setOrderAmount(long orderId) {
        this.orderId = orderId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
