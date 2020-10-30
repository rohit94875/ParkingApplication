package com.example.parkingApplication.repository;

import com.example.parkingApplication.entity.ParkingLevel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends CrudRepository<ParkingLevel,String> {
}
