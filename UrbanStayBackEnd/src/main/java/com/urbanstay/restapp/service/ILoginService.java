package com.urbanstay.restapp.service;

import com.urbanstay.restapp.entities.Login;
import com.urbanstay.restapp.entities.User;

public interface ILoginService {
    User verifyLogin(String mobile, String password);
}
