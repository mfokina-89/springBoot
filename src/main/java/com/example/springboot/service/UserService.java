package com.example.springboot.service;

import com.example.springboot.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

public interface UserService extends UserDetailsService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUserById(int id);
    User getUserById(int id);
    List<User> getUsers();
    User getUserByName(String name);
}
