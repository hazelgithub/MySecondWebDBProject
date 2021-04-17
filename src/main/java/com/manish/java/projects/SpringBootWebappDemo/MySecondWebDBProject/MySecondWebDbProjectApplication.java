package com.manish.java.projects.SpringBootWebappDemo.MySecondWebDBProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class MySecondWebDbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySecondWebDbProjectApplication.class, args);
		
		System.out.println("My 2nd Proj is Up and Running !!!");
	}

}
