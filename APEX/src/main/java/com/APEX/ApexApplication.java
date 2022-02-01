package com.APEX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:Message.properties")
@SpringBootApplication
public class ApexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApexApplication.class, args);
	}

	 
}
