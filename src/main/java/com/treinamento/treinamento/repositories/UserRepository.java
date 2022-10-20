package com.treinamento.treinamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.treinamento.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
	
}
