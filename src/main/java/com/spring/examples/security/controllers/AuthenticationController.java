package com.spring.examples.security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @RequestMapping("/")
    public String authenticate(){
        return "Welcome";
    }

    @RequestMapping("/user")
    public String authenticateUser(){
        return "<h1>Welcome user</h1>";
    }

    @RequestMapping("/admin")
    public String authenticateAdmin(){
        return "<h1>Welcome admin</h1>";
    }
}
