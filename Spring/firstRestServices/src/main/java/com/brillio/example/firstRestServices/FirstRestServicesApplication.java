package com.brillio.example.firstRestServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FirstRestServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstRestServicesApplication.class, args);
	}
}
