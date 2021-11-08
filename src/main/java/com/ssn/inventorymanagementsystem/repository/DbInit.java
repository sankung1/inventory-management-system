package com.ssn.inventorymanagementsystem.repository;

import com.ssn.inventorymanagementsystem.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit  implements CommandLineRunner {
    private UserRepository userRepository;

    public DbInit(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User sankung = new User("Sankung","Sillah",  "sankungsillah@gmail.com", "sankung1234", "ADMIN", "", "sankung");
        User tysce = new User("Tysce","Njie",  "tysec@gmail.com", "bitch1234", "Employee", "","tysce");

        List<User> users = Arrays.asList(sankung, tysce);

        // Save to database
        this.userRepository.saveAll(users);
    }
}
