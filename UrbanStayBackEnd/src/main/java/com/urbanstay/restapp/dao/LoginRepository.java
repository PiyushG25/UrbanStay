package com.urbanstay.restapp.dao;

import com.urbanstay.restapp.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Integer> {

        public Login findByMobileAndPassword(String mobile, String password);
}
