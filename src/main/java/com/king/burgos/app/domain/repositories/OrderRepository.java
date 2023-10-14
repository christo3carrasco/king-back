package com.king.burgos.app.domain.repositories;

import com.king.burgos.app.domain.entities.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    Order createOrder(Order order);

    List<Order> readOrder();

    void deleteOrder(int id);

    Optional<Order> readOrderId(int id);

    List<Order> readOrderUser(int userId);
}
