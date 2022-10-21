package com.treinamento.treinamento.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.treinamento.treinamento.entities.Order;
import com.treinamento.treinamento.entities.User;
import com.treinamento.treinamento.repositories.OrderRepository;
import com.treinamento.treinamento.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String...args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@f1rst.com", "45879652", "123456");
		User u2 = new User(null, "Alex Silva", "alex@f1rst.com", "35489685", "987654");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:07Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-10-25T05:30:07Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
