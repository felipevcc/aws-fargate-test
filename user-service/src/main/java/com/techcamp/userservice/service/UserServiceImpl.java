package com.techcamp.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.techcamp.userservice.model.User;
import com.techcamp.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public String deleteById(Long userId) {
        boolean foundUser = userRepository.existsById(userId);
        if (!foundUser) {
            return "Usuario no existe";
        }
        userRepository.deleteById(userId);
        return "Usuario eliminado correctamente";
    }
}
