package com.screens.babilo.dao;

import com.screens.babilo.dataentity.Admin;
import com.screens.babilo.dataentity.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumDao extends JpaRepository<Auditorium, Integer> {

}
