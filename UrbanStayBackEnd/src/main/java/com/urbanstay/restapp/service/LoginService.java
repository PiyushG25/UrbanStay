package com.urbanstay.restapp.service;

import com.urbanstay.restapp.dao.LoginRepository;
import com.urbanstay.restapp.entities.Login;
import com.urbanstay.restapp.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private IUserService userService;


    @Override
    public User verifyLogin(String mobile, String password) {

        User user = userService.getByMobileAndPassword(mobile,password);
        if(user != null)
        {
            return user;
        }
        else {
            return null;
        }
    }
}
