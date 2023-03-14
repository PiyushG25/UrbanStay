package com.urbanstay.restapp.service;

import com.urbanstay.restapp.dao.UserRepository;
import com.urbanstay.restapp.dto.UserDto;
import com.urbanstay.restapp.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User insertNewUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = userRepo.findAll();
        return userList;
    }

    @Override
    public User getByMobileAndPassword(String mobile, String password) {
        return userRepo.findByMobileAndPassword(mobile,password);
    }

    @Override
    public User getUserById(int id) {
        return userRepo.getUserById(id);
    }


    @Override
    public User updateUser(User user) {
        userRepo.save(user);
        return user;
    }



//    public UserDto convertUserToUserDto(User user)
//    {
//        UserDto userDto = new UserDto(user.getUser_id(),user.getFirst_name(), user.getLast_name(), user.getEmail(),
//                user.getMobile(),user.getAadharcardNumber(),user.getPassword(),user.getUser_id(),user.getGender(),
//                user.getAddress(),user.getActive());
//        return userDto;
//    }

}
