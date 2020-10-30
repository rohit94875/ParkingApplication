package com.example.parkingApplication.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class VehicleDTO {

    private String vehicleId;
    private int wheels;
    private Date inTime;
    private Date outTime;
    private String slotId;
    private int cost;
}
