package com.king.burgos.app.application.controllers;

import com.king.burgos.app.domain.entities.StatusOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface StatusOrderController {
    @PostMapping(value = "/{id}")
    StatusOrder postStatusOrder(@PathVariable(value = "id") int id);

    @GetMapping(value = "/{id}")
    List<StatusOrder> getStatusOrderId(@PathVariable(value = "id") int id);
}
