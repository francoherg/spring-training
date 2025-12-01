package com.example.demo.controller;

import com.example.demo.entities.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class movieController {
    @GetMapping("/movies")
    public Movie movies() {
        return new Movie("Pepito pepon once again 2: mas pepeado que nunca", 240, "Messi");
    }
}
