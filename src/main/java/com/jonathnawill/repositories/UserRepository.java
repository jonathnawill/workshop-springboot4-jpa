package com.jonathnawill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathnawill.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
