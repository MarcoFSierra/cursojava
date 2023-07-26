package edu.arelance.nube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayalumnoApplication {
	
	/*
	 * Para hacer gateway
	 * 
	 * 1) Nuevo proyecto con spring Starter Project con las 
	 * dependecias gateway y Eureka Client
	 * 
	 * 2)Anotacion de @EnableEurekaClient en el main
	 * 
	 * 3)Properties / yml configuracion / enrutamiento 
	 * 
	 */

	public static void main(String[] args) {
		SpringApplication.run(GatewayalumnoApplication.class, args);
	}

}