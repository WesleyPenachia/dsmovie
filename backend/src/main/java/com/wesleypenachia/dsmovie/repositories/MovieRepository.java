package com.wesleypenachia.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleypenachia.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
