package com.chrismerced.springapi.service;
import org.springframework.stereotype.Service;

import com.chrismerced.springapi.model.User;

@Service
public class UserService{
   public UserService(){

    }

    public User getUser(String firstName, String lastName){
        return new User(firstName, lastName);
    }
}