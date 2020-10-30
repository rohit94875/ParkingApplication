package com.example.parkingApplication.service;

import com.example.parkingApplication.entity.Vehicle;

import java.util.Date;

public interface VehicleService {

    String insert(Vehicle vehicle);
    int cost(String vehicleId);
}
