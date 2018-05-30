package com.example.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.api.APIApplication;
import com.example.demo.root.RootContext;
import com.example.demo.webapp.WebApplication;

@SpringBootConfiguration
@ComponentScan( basePackages = { "com.example.demo" })
public class Main {

	public static void main(String[] args) {		
		System.setProperty("spring.application.admin.enabled", "true");
		SpringApplicationBuilder appBuilder = new SpringApplicationBuilder()
                .parent(RootContext.class)
                .child(APIApplication.class)
                .sibling(WebApplication.class);
		
		ConfigurableApplicationContext apiContext = appBuilder.run(args);
		apiContext.setId("webContext");		
		
		ConfigurableApplicationContext rootContext = ((ConfigurableApplicationContext)apiContext.getParent());
		rootContext.setId("rootContext");		
	}		
}
