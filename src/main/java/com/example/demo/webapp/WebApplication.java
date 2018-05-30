package com.example.demo.webapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:webapp.properties")
public class WebApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("----------------------------------------- WebApp  Application Intialization ---------------------------------------------------------------");		
	}

}

