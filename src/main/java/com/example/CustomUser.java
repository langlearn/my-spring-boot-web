package com.example;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * Created by yjj31 on 2015/12/24.
 */
public class CustomUser extends User {
    private String email;
    private int age;

    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String email, int age) {
        super(username, password, authorities);
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
