package com.github.nitsebrod.CoolZoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CoolZooApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolZooApplication.class, args);
	}

}
