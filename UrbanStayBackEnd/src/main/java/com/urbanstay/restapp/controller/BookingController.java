package com.urbanstay.restapp.controller;

import com.urbanstay.restapp.entities.Booking;
import com.urbanstay.restapp.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/urbanstay")
public class BookingController {


    @Autowired
    IBookingService bookingService;

    @PostMapping("newbooking")
    public ResponseEntity<Booking> addNewBooking(@RequestBody Booking booking)
    {
            Booking b = bookingService.addNewBooking(booking);
            return ResponseEntity.ok(b);
    }

    @GetMapping("/getallbookings")
    public ResponseEntity<List<Booking>> getAllBookings()
    {
        List<Booking> bookingList = bookingService.getAllBooking();
        return ResponseEntity.ok(bookingList);
    }
}
