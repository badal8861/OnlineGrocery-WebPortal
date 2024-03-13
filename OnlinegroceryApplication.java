package com.onlinegrocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class OnlinegroceryApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			
		return application.sources(OnlinegroceryApplication.class);
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(OnlinegroceryApplication.class, args);
	}

}
