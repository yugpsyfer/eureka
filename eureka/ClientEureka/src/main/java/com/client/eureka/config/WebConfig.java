//package com.client.eureka.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
//@EnableWebMvc
//@Configuration
//@ComponentScan
//public class WebConfig implements WebMvcConfigurer{
//	
//	@Bean
//	public ViewResolver resolve() {
//		
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		
//		resolver.setPrefix("/static/");
//		resolver.setSuffix(".html");
//		
//		resolver.setViewClass(JstlView.class);
//		
//		return resolver;
//	}
//
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		// TODO Auto-generated method stub
//		//WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
//		
//		configurer.enable();
//	}
//	
//	
//
//}
