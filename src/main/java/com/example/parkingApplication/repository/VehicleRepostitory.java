package com.example.parkingApplication.repository;

import com.example.parkingApplication.entity.Vehicle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepostitory extends CrudRepository<Vehicle,String> {

//    @Query(value = "update vehicle set cost=age(out_time,in_time)*10 where vehicle_id=:vehicleId",nativeQuery = true)
//    int cost(@Param("vehicleId") String vehicleId);
}
