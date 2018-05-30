package com.example.demo.root;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:root.properties")
public class RootContext {
	
	public RootContext() {
		System.out.println("-------------------------- Root Context Intialization -------------------------------------------------");
	}

}
