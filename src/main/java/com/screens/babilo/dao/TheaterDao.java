package com.screens.babilo.dao;

import com.screens.babilo.dataentity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterDao extends JpaRepository<Theater, Integer> {

}
