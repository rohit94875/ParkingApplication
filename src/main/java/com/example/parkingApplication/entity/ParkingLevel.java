package com.example.parkingApplication.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class ParkingLevel {

    @Id
    private String levelId;
    private int carSlots;
    private int bikeSlots;
}
