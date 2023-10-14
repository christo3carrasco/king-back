package com.king.burgos.app.application.controllers;

import com.king.burgos.app.domain.dto.OrderDTO;
import com.king.burgos.app.domain.entities.Order;
import com.king.burgos.app.domain.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/order", produces = {"application/json"})
public class OrderControllerImpl implements OrderController {
    @Autowired
    private OrderService orderService;

    @Override
    public Order postOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setUserId(orderDTO.getUserId());
        order.setDate(orderDTO.getDate());
        order.setMenu(orderDTO.getMenu());
        return orderService.createOrder(order);
    }

    @Override
    public List<Order> getOrder() {
        return orderService.readOrder();
    }

    @Override
    public Optional<Order> getOrder(int id) {
        return orderService.readOrderId(id);
    }

    @Override
    public Order putOrder(int id, OrderDTO orderDTO) {
        return orderService.updateOrder(id, orderDTO);
    }

    @Override
    public void deleteOrder(int id) {
        orderService.deleteOrder(id);
    }

    @Override
    public List<Order> getOrderUser(int userId) {
        return orderService.readOrderUser(userId);
    }
}
