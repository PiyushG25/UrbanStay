package com.urbanstay.restapp.service;

import com.urbanstay.restapp.entities.Room;

import java.util.List;

public interface IRoomService {
    Room getById(int id);

    List<Room> getAllRooms();
}
