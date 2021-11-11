package com.ssn.inventorymanagementsystem.security;

import com.ssn.inventorymanagementsystem.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// this class maps our entity to the spring user details interface to securely save our users in spring
public class UserPrincipal implements UserDetails {

    @Autowired
    private User user;


    public UserPrincipal (User user){
        this.user = user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();

        // this extracts the list of permissions(name)

        this.user.getPermissionList().forEach(permissions ->{
            GrantedAuthority authority = new SimpleGrantedAuthority(permissions);
            authorities.add(authority);
        });



        //this extracts the list of roles our users have
        this.user.getRoleList().forEach(roles ->{
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + roles);
            authorities.add(authority);
        });
        return authorities;
    }


    @Override
    public String getPassword() {
        System.out.println("5aaaaaa ");
       // return this.user.getPassword();
        return "$2a$10$Xq4SNcjRpAmEbXTfRHOPAO/8QIw.MZR10VNndfR6eAvbHS1Qp62Xu";
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    public String getFirstName(){
        return this.user.getFirstName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
