package com.urbanstay.restapp.service;

import com.urbanstay.restapp.entities.User;

import java.util.List;

public interface IUserService {
    User insertNewUser(User user);

    List<User> getAllUsers();

    User getByMobileAndPassword(String mobile, String password);

    User updateUser(User user);

    User getUserById(int id);
}
