package com.screens.babilo.controller;

import com.screens.babilo.dataentity.Auditorium;
import com.screens.babilo.serviceImpl.AuditoriumServiceImpl;
import com.screens.babilo.serviceImpl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auditorium")
public class AuditoriumController {

    @Autowired
    private AuditoriumServiceImpl auditoriumService;

    @PostMapping("/audiReg")
    public ResponseEntity<HttpStatus> auditoriumRegistration(@RequestBody Auditorium auditorium){
        auditoriumService.addAuditorium(auditorium);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
