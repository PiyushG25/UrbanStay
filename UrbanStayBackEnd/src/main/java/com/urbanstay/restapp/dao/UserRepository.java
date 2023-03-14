package com.urbanstay.restapp.dao;

import com.urbanstay.restapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByMobileAndPassword(String mobile,String password);

    @Query("select u from User u where u.id = :Id")
    public User getUserById(@Param("Id") int id);
}
