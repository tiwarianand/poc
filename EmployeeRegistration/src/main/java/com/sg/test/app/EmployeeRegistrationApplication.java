package com.sg.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The Class EmployeeRegistrationApplication.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.sg.test")
@EnableJpaRepositories("com.sg.test.dao")
@EnableAutoConfiguration
@EntityScan("com.sg.test.entity")
public class EmployeeRegistrationApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistrationApplication.class, args);
	}
}
