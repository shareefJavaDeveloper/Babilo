package com.screens.babilo.serviceImpl;

import com.screens.babilo.dao.MovieDao;
import com.screens.babilo.dataentity.Movie;
import com.screens.babilo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public void addMovie(@NotNull Movie movie) {
        movieDao.saveAndFlush(movie);
    }

    @Override
    public List<Movie> getMovies() {
        return movieDao.findAll();
    }

}
