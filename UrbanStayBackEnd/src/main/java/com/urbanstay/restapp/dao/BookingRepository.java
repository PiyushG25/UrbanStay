package com.urbanstay.restapp.dao;

import com.urbanstay.restapp.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {


}
