package com.chrismerced.springapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.chrismerced.springapi.model.User;
import com.chrismerced.springapi.service.UserService;


@RestController
public class HelloController {
    private final UserService userService;    

    public HelloController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/helloname")
    public String helloname(@RequestParam(required=false) String param) {
        if(param == null){
            return "Hi mysterious person";
        }
        return "Hello " + param;
    }
    
    @GetMapping("/newUser")
    public User displayUser(@RequestParam String firstName, String lastName) {
        return userService.GetUser(firstName, lastName);
    }
    
    @GetMapping("/error")
    public String error() {
        return "Whoops";
    }
    
}
