package com.nie.user_val.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.nie.user_val.services.UserService;   // ✅ Make sure package matches your UserService
import com.nie.user_val.models.User;

@RestController
public class UserController {
    
    @Autowired
    UserService service;   // ✅ Correct service

    // ✅ Get all users
    @GetMapping("/users")    
    public List<User> getAllUsers() {
        return service.getAllUsers();
    } 

    // ✅ Add a new user
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }
}
