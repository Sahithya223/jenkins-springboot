package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeApplicationController {
	Logger logger=LoggerFactory.getLogger(PracticeApplicationController.class);
	
	@GetMapping("hello")
	public String getMessage()
	{
		logger.info("application started");
		return "Hello World";
	}

}
