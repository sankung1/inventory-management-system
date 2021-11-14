package com.ssn.inventorymanagementsystem.security;

import com.ssn.inventorymanagementsystem.entity.User;
import com.ssn.inventorymanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    public UserPrincipalDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(username);
        /*if (user == null){
            throw new UsernameNotFoundException("User not found");
        }
        */

        UserPrincipal userPrincipal = new UserPrincipal(user);
        return userPrincipal;
    }
}
