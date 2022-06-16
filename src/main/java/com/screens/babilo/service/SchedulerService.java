package com.screens.babilo.service;

import com.screens.babilo.dataentity.Movie;
import com.screens.babilo.dataentity.Schedule;

import java.util.List;

public interface SchedulerService {

    public void addSchedule(Schedule schedule);

    public List<Schedule> getSchedules();
}
