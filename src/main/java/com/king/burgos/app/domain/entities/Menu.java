package com.king.burgos.app.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "menu")
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String photo;
    private double price;
}
