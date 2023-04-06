package com.pirates.universalapp.service;

import com.pirates.universalapp.entity.User;
import com.pirates.universalapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> addUser() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUsername("user");
        user.setPassword("password");
        users.add(user);
        userRepository.saveAll(users);
        return userRepository.findAll();
    }
}
