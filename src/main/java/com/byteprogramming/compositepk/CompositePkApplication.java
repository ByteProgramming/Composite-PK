package com.byteprogramming.compositepk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CompositePkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositePkApplication.class, args);
	}

}
