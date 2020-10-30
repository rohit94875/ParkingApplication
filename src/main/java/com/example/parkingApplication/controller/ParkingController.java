package com.example.parkingApplication.controller;

import com.example.parkingApplication.dto.ParkingLevelDTO;
import com.example.parkingApplication.dto.SlotDTO;
import com.example.parkingApplication.dto.VehicleDTO;
import com.example.parkingApplication.entity.ParkingLevel;
import com.example.parkingApplication.entity.Slot;
import com.example.parkingApplication.entity.Vehicle;
import com.example.parkingApplication.service.LevelService;
import com.example.parkingApplication.service.SlotService;
import com.example.parkingApplication.service.VehicleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    LevelService levelService;

    @Autowired
    SlotService slotService;

    @Autowired
    VehicleService vehicleService;

    @PostMapping("/addLevel")
    public String addLevel(@RequestBody ParkingLevelDTO parkingLevelDTO)
    {
        ParkingLevel parkingLevel=new ParkingLevel();
        BeanUtils.copyProperties(parkingLevelDTO,parkingLevel);
        levelService.insert(parkingLevel);
        return "{\"message\":\"success\"}";
    }

    @PostMapping("/addSlot")
    public String addSlot(@RequestBody SlotDTO slotDTO)
    {
        Slot slot=new Slot();
        BeanUtils.copyProperties(slotDTO,slot);
        slotService.insert(slot);
        return "{\"message\":\"success\"}";
    }

    @PostMapping("/addVehicle")
    public String addVehicle(@RequestBody VehicleDTO vehicleDTO)
    {
        Vehicle vehicle=new Vehicle();
        BeanUtils.copyProperties(vehicleDTO,vehicle);
        return vehicleService.insert(vehicle);
    }

    @GetMapping("/emptyCarSlots/{type}")
    public List<Slot> emptySlots(@PathVariable("type") String type)
    {
        return slotService.emptySlots(type);
    }

    @GetMapping(value="/slotById/{id}")
    public Slot getById(@PathVariable("id") String id)
    {
        return slotService.getById(id);
    }

    @GetMapping("/cost/{id}")
    public int cost(@PathVariable("id") String id)
    {
        return vehicleService.cost(id);
    }

}
