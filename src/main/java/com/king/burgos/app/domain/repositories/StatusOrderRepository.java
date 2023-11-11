package com.king.burgos.app.domain.repositories;

import com.king.burgos.app.domain.entities.StatusOrder;

import java.util.List;

public interface StatusOrderRepository {
    StatusOrder createStatusOrder(StatusOrder statusOrder);

    List<StatusOrder> readStatusOrderId(int id);
}
