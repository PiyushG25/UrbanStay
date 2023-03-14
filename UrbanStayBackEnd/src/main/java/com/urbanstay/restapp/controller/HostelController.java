package com.urbanstay.restapp.controller;

import com.urbanstay.restapp.entities.Hostel;
import com.urbanstay.restapp.service.IHostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("urbanstay")
public class HostelController {

    @Autowired
    private IHostelService hostelService;

    @PostMapping("/newhostel")
    public ResponseEntity<Hostel> addNewHostel(@RequestBody Hostel hostel)
    {
        Hostel h = hostelService.insertNewHostel(hostel);
        return ResponseEntity.ok(h);
    }

    @GetMapping("allhostels")
    public ResponseEntity<List<Hostel>> getAllHostel()
    {
        List<Hostel> hostelList = hostelService.getAllHostel();
        return ResponseEntity.ok(hostelList);
    }

}
