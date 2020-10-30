package com.example.parkingApplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class Vehicle {

    @Id
    private String vehicleId;
    private int wheels;
    private LocalDateTime inTime;
    private LocalDateTime outTime;
    private String slotId;
    private int cost;
}
