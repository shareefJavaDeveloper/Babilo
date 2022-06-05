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
public class AuditoriumServiceImpl implements AuditoriumService {

    @Autowired
    private AuditoriumDao auditoriumDaoDao;

    @Override
    public void addAuditorium(@NotNull Auditorium auditorium) {
        if (auditoriumDaoDao.existsById(auditorium.getAuditoriumId()))
            throw new RuntimeException("Error at addAuditorium:AuditoriumId already Exist");
        else auditoriumDaoDao.saveAndFlush(auditorium);
    }

}
