package com.api.book.BookMgmntAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BookMgmntApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMgmntApiApplication.class, args);
	}

}
