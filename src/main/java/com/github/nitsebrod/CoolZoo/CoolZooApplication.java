package com.github.nitsebrod.CoolZoo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories(basePackages = "com.github.nitsebrod.CoolZoo", entityManagerFactoryRef = "sessionFactory")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CoolZooApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolZooApplication.class, args);
	}

}
