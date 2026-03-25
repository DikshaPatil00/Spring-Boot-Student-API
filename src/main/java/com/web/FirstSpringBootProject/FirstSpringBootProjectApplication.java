package com.web.FirstSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		
		
	}

}
