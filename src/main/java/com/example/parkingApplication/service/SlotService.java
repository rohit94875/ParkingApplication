package com.example.parkingApplication.service;

import com.example.parkingApplication.entity.Slot;

import java.util.List;

public interface SlotService {
    void insert(Slot slot);
    List<Slot> emptySlots(String type);
    Slot getById(String id);
}
