package com.tatva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/* 
 * @SpringBootApplication - this annotation is used to enable below three annotations with their default values
 * 		1. @ComponentScan - used to enable automatic component scan
 * 			0. @Component - use a generic annotation of below three.
 * 			1. @Repository - used to indicate a DAO
 * 			2. @Service - used to indicate a service class
 * 			3. @Controller - used to indicate a controller class
 * 		2. @Configuration - used to mark a class which has beans to initialize. 
 * 				
 * 		3. @EnableAutoConfiguration - enable Spring Boot’s auto-configuration mechanism
 * 
 * */
@SpringBootApplication
public class ApplicationStartPoint {

	public static void main(String args[]) {
		 SpringApplication.run(ApplicationStartPoint.class, args);
	}
	
// 	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
// 		// add more sources to the application if any.
// 		return app.sources(ApplicationStartPoint.class);
// 	}

}
