package com.ssn.inventorymanagementsystem.controller;

import com.ssn.inventorymanagementsystem.entity.User;
import com.ssn.inventorymanagementsystem.repository.UserRepository;
import com.ssn.inventorymanagementsystem.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
        @Autowired
        private UserServices userServices;

        // write http method to save user into the data base
    @PostMapping("/add")
    public String add(@RequestBody User user){
        userServices.saveUser(user);
        return "New user is Added";
    }
}
