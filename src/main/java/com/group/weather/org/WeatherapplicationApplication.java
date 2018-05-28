package com.group.weather.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class WeatherapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherapplicationApplication.class, args);
	}
}
