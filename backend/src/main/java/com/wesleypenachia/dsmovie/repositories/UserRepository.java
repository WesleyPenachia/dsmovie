package com.wesleypenachia.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleypenachia.dsmovie.entities.ScorePK;
import com.wesleypenachia.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, ScorePK>{
	
	User findByEmail(String email);
}
