package com.urbanstay.restapp.controller;

import com.urbanstay.restapp.dto.LoginRequestDto;
import com.urbanstay.restapp.entities.Login;
import com.urbanstay.restapp.entities.User;
import com.urbanstay.restapp.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/urbanstay")
public class LoginController {

    @Autowired
    ILoginService loginService;

    @PostMapping("/loginuser")
    public ResponseEntity<User> loginUser(@RequestBody Login login)
    {
        System.out.println(" In login "+login);

        User user = loginService.verifyLogin(login.getMobile(), login.getPassword());
               System.out.println(user);

       if(user != null)
       {
           return ResponseEntity.ok(user);
       }
       else
       {
           return ResponseEntity.ok(null);
       }
    }

}
