package com.nie.user_val.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nie.user_val.models.User;
import com.nie.user_val.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository repository;

    public List<User> getAllUsers() {
       return repository.findAll();
    }

    public User addUser(User user) {
       return repository.save(user);

}
}
