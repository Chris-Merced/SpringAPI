package com.chrismerced.springapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloController {
    
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
    
    
    @GetMapping("/error")
    public String error() {
        return "Whoops";
    }
    
}
