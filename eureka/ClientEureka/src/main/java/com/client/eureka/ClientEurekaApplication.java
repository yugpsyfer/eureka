package com.client.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableEurekaClient
@EnableWebSecurity
@EnableCaching
@EnableWebMvc
public class ClientEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientEurekaApplication.class, args);
	}

}
