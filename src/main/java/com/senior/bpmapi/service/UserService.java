package com.senior.bpmapi.service;

import com.senior.bpmapi.entity.User;
import com.senior.bpmapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean findOne(User user){
        Optional<User> us = Optional.ofNullable(userRepository.getUserByName(user.getName()));
       return us.map(ret ->{
            if(ret.getName().equals(user.getName()) && ret.getPassword().equals(user.getPassword())){
                return true;
            } else{
                return false;
            }
        }).orElse(false);
    }
}
