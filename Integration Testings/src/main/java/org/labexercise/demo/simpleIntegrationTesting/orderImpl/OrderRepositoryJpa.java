package org.labexercise.demo.simpleIntegrationTesting.orderImpl;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryJpa extends JpaRepository<OrderEntity, Long> {}
