package com.techcamp.userservice.service;

import com.techcamp.userservice.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long userId);

    User createUser(User newUser);

    User updateUser(User user);

    String deleteById(Long userId);
}
