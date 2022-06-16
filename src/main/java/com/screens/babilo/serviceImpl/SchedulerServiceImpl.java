package com.screens.babilo.serviceImpl;

import com.screens.babilo.dao.MovieDao;
import com.screens.babilo.dao.ScheduleDao;
import com.screens.babilo.dataentity.Movie;
import com.screens.babilo.dataentity.Schedule;
import com.screens.babilo.service.MovieService;
import com.screens.babilo.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
@Service
public class SchedulerServiceImpl implements SchedulerService {

    @Autowired
    private ScheduleDao scheduleDao;


    @Override
    public void addSchedule(Schedule schedule) {
        scheduleDao.saveAndFlush(schedule);
    }

    @Override
    public List<Schedule> getSchedules() {
        return scheduleDao.findAll();
    }
}
