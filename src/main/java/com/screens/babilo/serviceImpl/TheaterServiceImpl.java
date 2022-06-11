package com.screens.babilo.serviceImpl;

import com.screens.babilo.dao.TheaterDao;
import com.screens.babilo.dataentity.Theater;
import com.screens.babilo.service.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class TheaterServiceImpl implements AuditoriumService {

    @Autowired
    private TheaterDao theaterDaoDao;

    @Override
    public void addTheater(@NotNull Theater theater) {
        theaterDaoDao.saveAndFlush(theater);
    }

}
