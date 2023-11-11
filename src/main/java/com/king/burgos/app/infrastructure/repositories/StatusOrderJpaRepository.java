package com.king.burgos.app.infrastructure.repositories;

import com.king.burgos.app.domain.entities.StatusOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusOrderJpaRepository extends JpaRepository<StatusOrder, Integer> {
    List<StatusOrder> findByOrderId(int orderId);
}
