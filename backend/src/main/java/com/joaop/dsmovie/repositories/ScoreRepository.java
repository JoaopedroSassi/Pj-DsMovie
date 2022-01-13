package com.joaop.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaop.dsmovie.entities.Score;
import com.joaop.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
