package com.urbanstay.restapp.dao;

import com.urbanstay.restapp.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Integer> {

    @Query("select r from Room r where r.id=:Id")
    public Room getRoomById(@Param("Id") int id);

    @Query("select r from Room r")
    public List<Room> getAllRooms();


}
