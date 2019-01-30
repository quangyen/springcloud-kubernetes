package com.example.compositeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CompositeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompositeServiceApplication.class, args);
    }
}

