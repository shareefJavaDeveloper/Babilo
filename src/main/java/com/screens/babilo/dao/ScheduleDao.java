package com.screens.babilo.dao;

import com.screens.babilo.dataentity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleDao extends JpaRepository<Schedule,Integer> {


}
