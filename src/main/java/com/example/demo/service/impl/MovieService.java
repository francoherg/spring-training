package com.example.demo.service.impl;

import com.example.demo.entities.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private MovieRepository dbRepository;

    public boolean AddNew(Movie movie){
        try {
            dbRepository.insert(movie);
            return true;
        } catch (Exception e) {
            return false;
        }

    };
}
