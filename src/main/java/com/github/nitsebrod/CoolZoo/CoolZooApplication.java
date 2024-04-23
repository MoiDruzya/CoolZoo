package com.github.nitsebrod.CoolZoo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories()
@SpringBootApplication()
public class CoolZooApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoolZooApplication.class, args);
    }

}
