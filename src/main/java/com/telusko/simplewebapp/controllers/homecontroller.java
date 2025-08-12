package com.telusko.simplewebapp.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class homecontroller {
    @RequestMapping("/")
    public String greet() {
        return "Hello, welcome to the Simple Web Application!";
    }

    @RequestMapping("/about")
    public String ABOUT(){
        return "THIS IS ABOUT PAGE";
    }
    
}
        