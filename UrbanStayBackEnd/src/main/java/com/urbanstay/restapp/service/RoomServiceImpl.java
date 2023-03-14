package com.urbanstay.restapp.service;

import com.urbanstay.restapp.dao.RoomRepository;
import com.urbanstay.restapp.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService{

    @Autowired
    RoomRepository roomRepository;


    @Override
    public Room getById(int id) {
        return roomRepository.getRoomById(id);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.getAllRooms();
    }
}
