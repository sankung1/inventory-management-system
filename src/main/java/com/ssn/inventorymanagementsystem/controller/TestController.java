package com.ssn.inventorymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testPage")
public class TestController {

    @GetMapping
    public String testPage(){
        return "testPage";
    }
}
