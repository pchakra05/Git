package com.pcsoft.fum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages="com.pcsoft.fum")
public class MainApplication {
	
	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(MainApplication.class, args);

	        System.out.println("Spring Boot:");

//	        String[] beanNames = ctx.getBeanDefinitionNames();
//	        Arrays.sort(beanNames);
//	        for (String beanName : beanNames) {
//	            System.out.println(beanName);
//	        }
	}
}
