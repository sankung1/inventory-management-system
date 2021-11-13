package com.ssn.inventorymanagementsystem.service;

import com.ssn.inventorymanagementsystem.entity.User;
import com.ssn.inventorymanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServicesImplementation implements UserServices{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }
}
