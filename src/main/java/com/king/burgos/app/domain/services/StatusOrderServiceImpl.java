package com.king.burgos.app.domain.services;

import com.king.burgos.app.domain.entities.StatusOrder;
import com.king.burgos.app.infrastructure.repositories.StatusOrderRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusOrderServiceImpl implements StatusOrderService {
    @Autowired
    private StatusOrderRepositoryImpl statusOrderRepository;

    @Override
    public StatusOrder createStatusOrder(StatusOrder statusOrder) {
        return statusOrderRepository.createStatusOrder(statusOrder);
    }

    @Override
    public List<StatusOrder> readStatusOrderId(int id) {
        return statusOrderRepository.readStatusOrderId(id);
    }
}
