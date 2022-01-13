package com.wesleypenachia.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleypenachia.dsmovie.entities.Score;
import com.wesleypenachia.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
