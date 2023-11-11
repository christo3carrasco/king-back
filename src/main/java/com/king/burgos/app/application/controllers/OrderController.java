package com.king.burgos.app.application.controllers;

import com.king.burgos.app.domain.dto.OrderDTO;
import com.king.burgos.app.domain.entities.Order;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface OrderController {
    @PostMapping(consumes = {"application/json"})
    Order postOrder(@RequestBody OrderDTO orderDTO);

    @GetMapping
    List<Order> getOrder();

    @GetMapping(value = "/{id}")
    Optional<Order> getOrder(@PathVariable(value = "id") int id);

    @PutMapping(value = "/{id}", consumes = {"application/json"})
    Order putOrder(@PathVariable(value = "id") int id, @RequestBody OrderDTO orderDTO);

    @DeleteMapping(value = "/{id}")
    void deleteOrder(@PathVariable(value = "id") int id);

    @GetMapping(value = "/user/{userId}")
    List<Order> getOrderUser(@PathVariable(value = "userId") int userId);

    @GetMapping(value = "/date/{date}")
    List<Order> getOrderDate(@PathVariable(value = "date") Date date);
}
