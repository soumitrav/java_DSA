package com.expert.dsa.java_dsa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDsaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaDsaApplication.class, args);
		System.out.println("Application started");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside run method");
	}
}
