package com.iotrack.pushapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages="com.iotrack.pushapi")
@EnableMongoRepositories(basePackages = "com.iotrack.pushapi")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class})
public class PushapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushapiApplication.class, args);
	}
}
