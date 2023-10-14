package com.king.burgos.app.infrastructure.repositories;

import com.king.burgos.app.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderJpaRepository extends JpaRepository<Order, Integer> {
    List<Order> findByUserId(int userId);
}
