package com.orderManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.orderManagement.controller.MainController;

@SpringBootApplication
@ComponentScan(basePackageClasses=MainController.class)
public class OrderManagementApplication  extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OrderManagementApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementApplication.class, args);
	}
}
