package com.screens.babilo.dao;

import com.screens.babilo.dataentity.Movie;
import com.screens.babilo.dataentity.MovieBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieBookingDao extends JpaRepository<MovieBooking,Integer> {
}
