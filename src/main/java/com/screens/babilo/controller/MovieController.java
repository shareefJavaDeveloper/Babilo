package com.screens.babilo.controller;

import com.screens.babilo.dataentity.Auditorium;
import com.screens.babilo.dataentity.Movie;
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
public class MovieController {

    @Autowired
    private MovieServiceImpl movieService;

    @PostMapping("/audiReg")
    public ResponseEntity<HttpStatus> MovieRegistration(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
