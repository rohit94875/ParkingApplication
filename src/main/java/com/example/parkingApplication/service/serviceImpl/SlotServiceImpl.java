package com.example.parkingApplication.service.serviceImpl;

import com.example.parkingApplication.entity.Slot;
import com.example.parkingApplication.repository.SlotRepository;
import com.example.parkingApplication.service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SlotServiceImpl implements SlotService {

    @Autowired
    SlotRepository slotRepository;

    @Override
    public void insert(Slot slot) {
        slotRepository.save(slot);
    }

    @Override
    public List<Slot> emptySlots(String type) {
        return slotRepository.emptySlots(type);
    }

    @Override
    public Slot getById(String id) {
        Optional<Slot> slot=slotRepository.findById(id);
        return slot.get();
    }


}
