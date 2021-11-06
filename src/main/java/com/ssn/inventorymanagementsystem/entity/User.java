package com.ssn.inventorymanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String firstName;
    private String lastNmae;
    private String email;
    private String password;
    private String role;



}
