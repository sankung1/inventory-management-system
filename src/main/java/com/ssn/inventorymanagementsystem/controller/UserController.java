package com.ssn.inventorymanagementsystem.controller;

import com.ssn.inventorymanagementsystem.entity.User;
import com.ssn.inventorymanagementsystem.repository.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
        @Autowired
        private Test repo;

        @GetMapping("/users")
        public String listAll(Model model) {
            List<User> listUsers = repo.findAll();
            model.addAttribute("listUsers", listUsers);
            return "users";
        }
}
