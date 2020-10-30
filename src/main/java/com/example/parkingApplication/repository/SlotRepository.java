package com.example.parkingApplication.repository;

import com.example.parkingApplication.entity.Slot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface SlotRepository extends CrudRepository<Slot,String> {

    @Query(value = "select * from slot where is_empty=true and type=:type order by slot_id",nativeQuery = true)
    List<Slot> emptySlots(@Param("type") String type);
}
