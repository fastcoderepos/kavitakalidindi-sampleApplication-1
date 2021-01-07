package com.fastcode.sampleapplication1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.fastcode.sampleapplication1", "org.springframework.versions" })
public class Sampleapplication1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sampleapplication1Application.class, args);
    }
}
