package com.example.parkingApplication.service.serviceImpl;

import com.example.parkingApplication.entity.Slot;
import com.example.parkingApplication.entity.Vehicle;
import com.example.parkingApplication.repository.SlotRepository;
import com.example.parkingApplication.repository.VehicleRepostitory;
import com.example.parkingApplication.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepostitory vehicleRepostitory;

    @Autowired
    SlotRepository slotRepository;

    @Override
    public String insert(Vehicle vehicle) {
        String type="";
        String res="";
        if (vehicle.getWheels()==4)
        {
            type="car";
            List<Slot> slots = slotRepository.emptySlots(type);
            if (slots.size()!=0)
            {
                vehicle.setSlotId(slots.get(0).getSlotId());
                vehicle.setInTime(LocalDateTime.now());
                Optional<Slot> slot=slotRepository.findById(slots.get(0).getSlotId());
                slot.get().setIsEmpty(false);
                vehicleRepostitory.save(vehicle);
                res="success";
                return res;
            }
            else
                {
                    res="No empty slots available";
                    return res;
                }
        }
        else
        {
            type="bike";
            List<Slot> slots = slotRepository.emptySlots(type);
            if (slots.size()!=0)
            {
                vehicle.setSlotId(slots.get(0).getSlotId());
                vehicle.setInTime(LocalDateTime.now());
                Optional<Slot> slot=slotRepository.findById(slots.get(0).getSlotId());
                slot.get().setIsEmpty(false);
                vehicleRepostitory.save(vehicle);
                res="success";
                return res;
            }
            else
            {
                res="No empty slots available";
                return res;
            }
        }
    }


    @Override
    public int cost(String vehicleId) {
        Optional<Vehicle> vehicle=vehicleRepostitory.findById(vehicleId);
        Vehicle vehicle1=vehicle.get();
        vehicle1.setOutTime(LocalDateTime.now());
        LocalDateTime out=vehicle1.getOutTime();
        LocalDateTime in=vehicle1.getInTime();
        Duration duration=Duration.between(in,out);
        int diff=(int) Math.abs(duration.toMinutes());
        vehicle1.setCost(diff*10);
        vehicleRepostitory.save(vehicle1);
        return diff*10;
    }
}
