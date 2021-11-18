package com.ssn.inventorymanagementsystem.repository;

import com.ssn.inventorymanagementsystem.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit  implements CommandLineRunner {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
       this.userRepository.deleteAll();
        User sankung = new User("Sankung","Sillah", passwordEncoder.encode("abc1234"),"sankung", "ADMIN", ""  );
        User tysce = new User("Tysce","Njie", passwordEncoder.encode( "1234"),"tysce", "EMPLOYEE","");

        List<User> users = Arrays.asList(sankung, tysce);

        // Save to database
        this.userRepository.saveAll(users);
    }
}
