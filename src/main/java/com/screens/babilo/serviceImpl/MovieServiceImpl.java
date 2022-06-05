package com.screens.babilo.serviceImpl;

import com.screens.babilo.dao.AuditoriumDao;
import com.screens.babilo.dao.MovieDao;
import com.screens.babilo.dataentity.Auditorium;
import com.screens.babilo.dataentity.Movie;
import com.screens.babilo.service.AuditoriumService;
import com.screens.babilo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public void addMovie(@NotNull Movie movie) {
        if (movieDao.existsById(movie.getMovieId()))
            throw new RuntimeException("Error at addMovie:MovieBookingId already Exist");
        else movieDao.saveAndFlush(movie);
    }

}
