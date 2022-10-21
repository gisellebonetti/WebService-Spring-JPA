package com.treinamento.treinamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.treinamento.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
