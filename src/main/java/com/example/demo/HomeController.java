package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    public record Usuario(String nombre) {}

    @GetMapping("/api/usuario")
    public Usuario usuario() {
        return new Usuario("pepito pepon la revancha");
    }
}
