package com.urbanstay.restapp.service;

import com.urbanstay.restapp.dao.BookingRepository;
import com.urbanstay.restapp.entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements  IBookingService{

    @Autowired
    BookingRepository bookingRepo;

    @Override
    public Booking addNewBooking(Booking booking) {

        bookingRepo.save(booking);
        return booking;
    }

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepo.findAll();
    }
}
