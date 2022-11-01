package com.example.microservices.client.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientOneApplication.class, args);
    }
}
