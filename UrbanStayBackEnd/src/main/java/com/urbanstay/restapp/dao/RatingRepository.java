package com.urbanstay.restapp.dao;

import com.urbanstay.restapp.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Integer> {
}
