package org.labexercise.demo.simpleIntegrationTest.orderImpl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.labexercise.demo.simpleIntegrationTesting.orderImpl.OrderEntity;
import org.labexercise.demo.simpleIntegrationTesting.orderImpl.OrderServiceImpl;
import org.labexercise.demo.unitTesting.orderSerivce.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class OrderServiceImpTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Test
    void saveOrder() {
        Order order1 = new Order("Iphone", 2);
        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setOrderAmount(order1.getAmount());
        orderEntity.setName(order1.getName());

        var newOrder = orderService.saveOrder(order1);

        OrderEntity savedOrder = orderService.getOrderById(newOrder.getOrderId());

        Assertions.assertThat(newOrder).isNotNull();
        Assertions.assertThat("Iphone").isEqualTo(savedOrder.getOrderName());
    }
}