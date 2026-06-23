package com.example.usersDemo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository us;


    public UserService(UserRepository us) {
        this.us = us;
    }

    public void save(User user) {
        us.save(user);
    }

    public Optional<User> find(int id) {
        return us.findById(id);
    }

    public List<User> findAll() {
        return us.findAll();
    }
    


}