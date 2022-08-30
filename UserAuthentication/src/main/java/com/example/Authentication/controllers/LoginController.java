package com.example.Authentication.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;


@RestController
public class LoginController {

	@Autowired
	UserRepository userRepository;
	
    @GetMapping("/login")
    public String showLogin(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password, ModelMap map) {
        User u = new User(name,email,password);
        userRepository.save(u); 
        
        return "Data received succssfully";
    }

    
    
    @PostMapping("/login")
    public String submitLogin(@RequestParam String username, @RequestParam String password){

        //TODO:

        return "Success";



    }
}
