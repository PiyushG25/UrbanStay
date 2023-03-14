package com.urbanstay.restapp.dao;

import com.urbanstay.restapp.entities.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelRepository extends JpaRepository<Hostel,Integer> {


}
