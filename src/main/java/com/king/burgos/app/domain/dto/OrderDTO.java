package com.king.burgos.app.domain.dto;

import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class OrderDTO {
    private int id;
    private int userId;
    private Date date;
    private List menu;
}
