package com.ssn.inventorymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/createUser")
public class CreateUserController {
    @GetMapping
    public String addUser(){
        return "createUser/index";
    }
}
