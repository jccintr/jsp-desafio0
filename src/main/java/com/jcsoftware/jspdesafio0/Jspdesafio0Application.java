package com.jcsoftware.jspdesafio0;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jspdesafio0Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jspdesafio0Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Testando !");
		
	}

}
