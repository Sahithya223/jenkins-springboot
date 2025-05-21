package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.fill.JasperReportSource;

@RestController
public class PracticeApplicationController {
	
	@GetMapping("hello")
	public String getMessage()
	{
		return "Hello World";
	}

}
