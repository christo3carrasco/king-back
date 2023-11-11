package com.king.burgos.app.infrastructure.repositories;

import com.king.burgos.app.domain.entities.StatusOrder;
import com.king.burgos.app.domain.repositories.StatusOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StatusOrderRepositoryImpl implements StatusOrderRepository {
    @Autowired
    StatusOrderJpaRepository db;

    @Override
    public StatusOrder createStatusOrder(StatusOrder statusOrder) {
        return db.save(statusOrder);
    }

    @Override
    public List<StatusOrder> readStatusOrderId(int id) {
        return db.findByOrderId(id);
    }
}
