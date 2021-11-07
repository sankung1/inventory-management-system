package com.ssn.inventorymanagementsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //create an in memory user with the given roles admin and employee
    // add the password encoder bean we initialized to our user passwords to encode them with
    // the bcrypt encoder.
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth

                .inMemoryAuthentication()
                .withUser("admin").password(passwordEncoder().encode("admin1234")).roles("ADMIN")
                .and()
                .withUser("sankung").password(passwordEncoder().encode("sankung1234")).roles("EMPLOYEE");
    }

    // override the configure method to authorize the authenticated user to see certain views based on their roles
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http

                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    // create a new bean to encode our user passwords
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
