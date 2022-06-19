package com.screens.babilo.controller;

import com.screens.babilo.dataentity.Admin;
import com.screens.babilo.dataentity.User;
import com.screens.babilo.service.UserService;
import com.screens.babilo.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
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

    @PostMapping("/userLogin")
    public ResponseEntity<Optional<User>> userLogin(@RequestParam String emailId, @RequestParam String password){
        Optional<User> user = userService.checkLogin(emailId,password);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

}
