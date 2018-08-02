package com.restmongoapi.app.restmongoapiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.restmongoapi.app")

@EnableMongoRepositories(basePackages = "com.restmongoapi.app")
/*@EnableAutoConfiguration(exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class}) */
public class RestmongoapiappApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
		SpringApplication.run(RestmongoapiappApplication.class, args);
	}
}
