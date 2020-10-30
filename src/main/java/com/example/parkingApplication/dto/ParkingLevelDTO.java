package com.example.parkingApplication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingLevelDTO {

    private String levelId;
    private int carSlots;
    private int bikeSlots;
}
