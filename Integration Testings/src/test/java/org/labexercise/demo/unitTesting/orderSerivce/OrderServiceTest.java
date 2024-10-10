package org.labexercise.demo.unitTesting.orderSerivce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.labexercise.demo.unitTesting.orderSerivce.Order;
import org.labexercise.demo.unitTesting.orderSerivce.OrderRepository;
import org.labexercise.demo.unitTesting.orderSerivce.OrderService;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.security.NoSuchAlgorithmException;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @MockBean
    private OrderRepository orderRepository;

    @Test
    void saveOrder() throws NoSuchAlgorithmException {
        Order order1 = new Order("Iphone", 2);
        Mockito.when(orderRepository.save(Mockito.any(Order.class))).thenReturn(order1);

        Order savedOrder = orderService.saveOrder(order1);

        Assertions.assertEquals("Iphone", savedOrder.getName());
        Assertions.assertEquals(2, savedOrder.getAmount());
    }
}