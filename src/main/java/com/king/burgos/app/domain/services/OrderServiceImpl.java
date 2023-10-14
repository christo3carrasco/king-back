package com.king.burgos.app.domain.services;

import com.king.burgos.app.domain.dto.OrderDTO;
import com.king.burgos.app.domain.entities.Order;
import com.king.burgos.app.infrastructure.repositories.OrderRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepositoryImpl orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.createOrder(order);
    }

    @Override
    public List<Order> readOrder() {
        return orderRepository.readOrder();
    }

    @Override
    public Order updateOrder(int id, OrderDTO orderDTO) {
        Order updateOrder = orderRepository.readOrderId(id).orElse(null);
        if (updateOrder != null) {
            updateOrder.setUserId(orderDTO.getUserId());
            updateOrder.setDate(orderDTO.getDate());
            updateOrder.setMenu(orderDTO.getMenu());
        }
        return orderRepository.createOrder(updateOrder);
    }

    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteOrder(id);
    }

    @Override
    public Optional<Order> readOrderId(int id) {
        return orderRepository.readOrderId(id);
    }

    @Override
    public List<Order> readOrderUser(int userId) {
        return orderRepository.readOrderUser(userId);
    }
}
