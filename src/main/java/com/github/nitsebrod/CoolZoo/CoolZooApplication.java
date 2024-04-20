package com.github.nitsebrod.CoolZoo;

import com.github.nitsebrod.CoolZoo.animal.dao.AnimalRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(value = "com.github.nitsebrod.CoolZoo")
//@EnableJpaRepositories(repositoryBaseClass = AnimalRepository.class)
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CoolZooApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolZooApplication.class, args);
	}

}
