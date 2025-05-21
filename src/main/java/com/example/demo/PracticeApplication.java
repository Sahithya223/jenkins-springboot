package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {
	static Logger logger=LoggerFactory.getLogger(PracticeApplicationController.class);

	public static void main(String[] args) {
		logger.info("application started");
		SpringApplication.run(PracticeApplication.class, args);
	}

}
