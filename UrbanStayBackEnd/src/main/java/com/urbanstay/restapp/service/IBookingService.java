package com.urbanstay.restapp.service;

import com.urbanstay.restapp.entities.Booking;

import java.util.List;

public interface IBookingService {
    Booking addNewBooking(Booking booking);

    List<Booking> getAllBooking();
}
