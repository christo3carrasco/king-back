package com.king.burgos.app.domain.services;

import com.king.burgos.app.domain.entities.StatusOrder;

import java.util.List;

public interface StatusOrderService {
    StatusOrder createStatusOrder(StatusOrder statusOrder);

    List<StatusOrder> readStatusOrderId(int id);
}
