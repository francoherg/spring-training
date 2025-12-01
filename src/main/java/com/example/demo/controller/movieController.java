package com.example.demo.controller;

import com.example.demo.entities.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class movieController {
    @GetMapping("/movies")
    public Movie[] movies() { // tambien se puede usar list
        return new Movie[] {
                new Movie("Pepito pepon once again 2: mas pepeado que nunca", 240, "Messi")
        };
    }

}
