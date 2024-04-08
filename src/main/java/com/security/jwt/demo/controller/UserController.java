package com.security.jwt.demo.controller;

import com.security.jwt.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.jwt.demo.models.User;

import java.util.List;

@RestController
public class UserController {

    @Value("${jwt.header}")
    private String tokenHeader;

    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
    	List<User> users = this.userRepository.findAll();
    	return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
