package com.techcamp.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.techcamp.userservice.model.User;
import com.techcamp.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> user =  userService.getAllUsers();

        if(user.isEmpty()){
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }
    }
    
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId) {
      User foundUser = userService.getUserById(userId);
      if (foundUser == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      }
      return ResponseEntity.status(HttpStatus.OK).body(foundUser);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser) {
      User createdUser = userService.createUser(newUser);
      if (createdUser == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      }
      return ResponseEntity.status(HttpStatus.OK).body(createdUser);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updatedUser = userService.updateUser(user);
        if(updatedUser == null){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }
    }
    
    @DeleteMapping
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
      userService.deleteById(userId);
      return ResponseEntity.status(HttpStatus.OK).body("Usuario eliminado correctamente");
    }
}
