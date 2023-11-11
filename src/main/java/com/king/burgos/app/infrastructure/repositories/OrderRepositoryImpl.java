package com.king.burgos.app.infrastructure.repositories;

import com.king.burgos.app.domain.entities.Order;
import com.king.burgos.app.domain.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Component
public class OrderRepositoryImpl implements OrderRepository {
    @Autowired
    OrderJpaRepository db;

    @Override
    public Order createOrder(Order order) {
        return db.save(order);
    }

    @Override
    public List<Order> readOrder() {
        return db.findAll();
    }

    @Override
    public void deleteOrder(int id) {
        db.deleteById(id);
    }

    @Override
    public Optional<Order> readOrderId(int id) {
        return db.findById(id);
    }

    @Override
    public List<Order> readOrderUser(int userId) {
        return db.findByUserId(userId);
    }

    @Override
    public List<Order> readOrderDate(Date date) {
        return db.findByDate(date);
    }
}
