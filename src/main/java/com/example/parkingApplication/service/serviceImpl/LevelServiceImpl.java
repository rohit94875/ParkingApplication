package com.example.parkingApplication.service.serviceImpl;

import com.example.parkingApplication.entity.ParkingLevel;
import com.example.parkingApplication.repository.LevelRepository;
import com.example.parkingApplication.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelServiceImpl implements LevelService {

    @Autowired
    LevelRepository levelRepository;

    @Override
    public void insert(ParkingLevel parkingLevel) {
        levelRepository.save(parkingLevel);
    }
}
