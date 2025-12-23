package com.example.demo.service.impl;

import com.example.demo.entities.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.IMovieService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MovieService implements IMovieService {

    private static final Logger log = LoggerFactory.getLogger(MovieService.class);

    @Autowired
    private MovieRepository dbRepository;

    public boolean AddNew(Movie movie) {
        try {
            log.info("Intentando guardar película: {}", movie);
            dbRepository.insert(movie);
            log.info("Película guardada correctamente");
            return true;
        } catch (Exception e) {
            log.error("Error al guardar película", e);
            return false;
        }
    }
}
