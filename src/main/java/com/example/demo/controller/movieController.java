package com.example.demo.controller;

import com.example.demo.entities.Movie;
import com.example.demo.service.impl.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/movies")
@RestController
public class movieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public Movie[] movies() { // tambien se puede usar list
        return new Movie[] {
                new Movie("Pepito pepon once again 2: mas pepeado que nunca", 240, "Messi")
        };
    }

    @PostMapping("/new")
    public ResponseEntity<Boolean> newMovie(@RequestBody Movie newMovie) {
        return new ResponseEntity<>(movieService.AddNew(newMovie), HttpStatus.OK);
    }
}
