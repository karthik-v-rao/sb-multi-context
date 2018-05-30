package com.example.demo.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:api.properties")
public class APIApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("----------------------------------------- API Application Intialization ---------------------------------------------------------------");		
	}

}
