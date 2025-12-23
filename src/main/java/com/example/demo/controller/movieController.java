package com.example.demo.controller;

import com.example.demo.entities.Movie;
import com.example.demo.service.impl.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/movies")
@RestController
public class movieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>>getMovies() {
        return new ResponseEntity<>(movieService.FindAll(), HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<Boolean> newMovie(@RequestBody Movie newMovie) {
        return new ResponseEntity<>(movieService.AddNew(newMovie), HttpStatus.OK);
    }
}
