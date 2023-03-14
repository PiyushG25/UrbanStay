package com.urbanstay.restapp.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.urbanstay.restapp.entities.User;
import com.urbanstay.restapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/urbanstay")
public class UserController {

    @Autowired(required = true)
    IUserService userService;

    @PostMapping("/newuser")
    public ResponseEntity<User> addNewUser(@RequestBody User user)
    {

        System.out.println(user);
       User u = userService.insertNewUser(user);
        return ResponseEntity.ok(u);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers()
    {
        List<User> userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getByUserById(@PathVariable int id)
    {
         User user = userService.getUserById(id);
         return ResponseEntity.ok(user);
    }

    @PutMapping("/updateuser")
    public ResponseEntity<User> updateUser(@RequestBody User user)
    {
          User u = userService.updateUser(user);
          return ResponseEntity.ok(u);
    }



}
