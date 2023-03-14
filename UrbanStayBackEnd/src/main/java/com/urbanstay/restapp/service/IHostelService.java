package com.urbanstay.restapp.service;

import com.urbanstay.restapp.entities.Hostel;

import java.util.List;

public interface IHostelService {
    Hostel insertNewHostel(Hostel hostel);

    List<Hostel> getAllHostel();
}
