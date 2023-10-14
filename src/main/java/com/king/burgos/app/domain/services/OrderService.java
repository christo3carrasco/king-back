package com.king.burgos.app.domain.services;

import com.king.burgos.app.domain.dto.OrderDTO;
import com.king.burgos.app.domain.entities.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    Order createOrder(Order order);

    List<Order> readOrder();

    Order updateOrder(int id, OrderDTO orderDTO);

    void deleteOrder(int id);

    Optional<Order> readOrderId(int id);

    List<Order> readOrderUser(int userId);
}
