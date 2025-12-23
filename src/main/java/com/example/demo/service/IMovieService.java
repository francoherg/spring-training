package com.example.demo.service;

import com.example.demo.entities.Movie;

import java.util.List;

public interface IMovieService {
    public boolean AddNew(Movie movie);
    public List<Movie> FindAll();
}
