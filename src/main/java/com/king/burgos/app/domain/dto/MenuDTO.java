package com.king.burgos.app.domain.dto;

import lombok.Data;

@Data
public class MenuDTO {
    private int id;
    private String description;
    private String photo;
    private double price;
}
