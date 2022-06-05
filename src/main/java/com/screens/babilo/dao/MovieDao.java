package com.screens.babilo.dao;

import com.screens.babilo.dataentity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie,Integer> {
}
