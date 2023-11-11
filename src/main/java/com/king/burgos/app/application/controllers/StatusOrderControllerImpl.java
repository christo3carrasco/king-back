package com.king.burgos.app.application.controllers;

import com.king.burgos.app.domain.entities.StatusOrder;
import com.king.burgos.app.domain.services.StatusOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/status", produces = {"application/json"})
public class StatusOrderControllerImpl implements StatusOrderController {
    @Autowired
    private StatusOrderService statusOrderService;

    @Override
    public StatusOrder postStatusOrder(int id) {
        StatusOrder statusOrder = new StatusOrder();
        statusOrder.setOrderId(id);
        statusOrder.setState0((byte) 1);
        statusOrder.setState1((byte) 0);
        statusOrder.setState2((byte) 0);
        statusOrder.setState3((byte) 0);
        statusOrder.setState4((byte) 0);
        statusOrder.setState5((byte) 0);
        statusOrder.setState6((byte) 0);
        statusOrder.setState7((byte) 0);
        return statusOrderService.createStatusOrder(statusOrder);
    }

    @Override
    public List<StatusOrder> getStatusOrderId(int id) {
        return statusOrderService.readStatusOrderId(id);
    }
}
