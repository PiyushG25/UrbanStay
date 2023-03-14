package com.urbanstay.restapp.controller;

import com.urbanstay.restapp.entities.Room;
import com.urbanstay.restapp.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/urbanstay")
public class RoomController {

    @Autowired
    IRoomService roomService;

    @GetMapping("/rooms")
    public ResponseEntity<List<Room>> getAllRooms()
    {
        List<Room> roomList = roomService.getAllRooms();
        return ResponseEntity.ok(roomList);
    }

    @GetMapping("/rooms/{id}")
    public ResponseEntity<Room> getById(@PathVariable int id)
    {
        Room room = roomService.getById(id);
        return ResponseEntity.ok(room);
    }



}
