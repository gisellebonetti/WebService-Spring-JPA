package com.treinamento.treinamento.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.treinamento.treinamento.entities.User;
import com.treinamento.treinamento.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String...args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@f1rst.com", "45879652", "123456");
		User u2 = new User(null, "Alex Silva", "alex@f1rst.com", "35489685", "987654");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
