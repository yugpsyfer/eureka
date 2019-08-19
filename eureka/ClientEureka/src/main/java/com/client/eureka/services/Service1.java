package com.client.eureka.services;

import java.security.Principal;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Service1 {

	
	
	
	@GetMapping("/login")
	@Secured({"ROLE_ADMIN"})
	@Cacheable("y")
	public String service1(Principal user) throws InterruptedException {
		
		Thread.sleep(3000);
		return "login";
		
	}
	
	
}
