package com.frank.testmicroservice;

import com.frank.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloController.class)
public class TestMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMicroserviceApplication.class, args);
	}

}
