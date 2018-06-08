package com.spring.boot.micro.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMicroDatabaseApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMicroDatabaseApplication.class, args);
	}
}
