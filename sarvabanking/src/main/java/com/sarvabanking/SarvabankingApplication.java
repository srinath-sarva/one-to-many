package com.sarvabanking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SarvabankingApplication {

	@Autowired
	static
	Repository repo;
	public static void main(String[] args) {
		
		SpringApplication.run(SarvabankingApplication.class, args);
			repo.save(new Account(1, "savings","sarva sai srinath", "sarva", 10000.0, "hyd", "95159"));
	}
}
