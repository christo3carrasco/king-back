package com.king.burgos.app.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "statusOrder")
@Data
public class StatusOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int orderId;
    private byte state0;
    private byte state1;
    private byte state2;
    private byte state3;
    private byte state4;
    private byte state5;
    private byte state6;
    private byte state7;
}
