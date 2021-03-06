package com.screens.babilo.controller;

import com.screens.babilo.dataentity.Admin;
import com.screens.babilo.serviceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @PostMapping("/adminReg")
    public ResponseEntity<HttpStatus> adminRegistration(@RequestBody Admin admin){
            adminService.addAdmin(admin);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/adminLogin")
    public ResponseEntity<Optional<Admin>> userLogin(@RequestParam String emailId, @RequestParam String password){
        Optional<Admin> value = adminService.checkLogin(emailId,password);
        return new ResponseEntity<>(value,HttpStatus.OK);
    }

}
