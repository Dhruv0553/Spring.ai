package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.sprinaidemo")
public class SpringAiPromptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiPromptApplication.class, args);
	}

}
