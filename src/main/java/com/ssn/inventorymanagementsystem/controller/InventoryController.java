package com.ssn.inventorymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping
    public String inventoryPage(){
        return "inventory/index";
    }
    @GetMapping("/addInventory")
    public String addInventory(){
        return "inventory/addInventory";
    }
}
