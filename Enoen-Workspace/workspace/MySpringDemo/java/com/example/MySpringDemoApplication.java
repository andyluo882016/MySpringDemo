package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class MySpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringDemoApplication.class, args);
	}
}
