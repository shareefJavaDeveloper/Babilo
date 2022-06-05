package com.screens.babilo.controller;

import com.screens.babilo.dataentity.Admin;
import com.screens.babilo.dataentity.User;
import com.screens.babilo.service.UserService;
import com.screens.babilo.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/userReg")
    public ResponseEntity<HttpStatus> userRegistration(@RequestBody User user){
            userService.addUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
