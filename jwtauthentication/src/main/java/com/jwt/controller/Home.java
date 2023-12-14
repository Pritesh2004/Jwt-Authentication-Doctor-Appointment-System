package com.jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;

@RestController
@CrossOrigin(origins = "*")

public class Home {

    @RequestMapping("/welcome")
    public String welcome() {
        String text = "this is private page ";
        text+= "this page is not allowed to unauthenticated users";
        return text;
    }
    @CrossOrigin(origins = "http://localhost:4200")
//    @CrossOrigin(origins = "http://localhost:4200/dashboard")
    @GetMapping("/getusers")
    public String getUser() {
    	
    	
        return "hello user";
    }

}
