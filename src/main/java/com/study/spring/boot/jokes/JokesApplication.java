package com.study.spring.boot.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.study.spring.boot.jokes.services.ChuckNorrisQuoteService;

@SpringBootApplication
public class JokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesApplication.class, args);
	}
}
