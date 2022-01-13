package com.joaop.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaop.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
