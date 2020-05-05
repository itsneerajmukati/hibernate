package com.nm.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.nm")
public class HibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateExampleApplication.class, args);
	}

}
