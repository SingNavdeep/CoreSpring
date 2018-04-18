package com.study.spring.boot.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * boot starter class.
 * @SpringBootApplication scans the current package and its subpackages for spring stereotypes.
 * @CompponentScan is not required. If this class and spring stereotypesare in different packages,
 * then ComponentScan is required
 * @author Navdeep
 *
 */
@SpringBootApplication
public class JokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesApplication.class, args);
	}
}
