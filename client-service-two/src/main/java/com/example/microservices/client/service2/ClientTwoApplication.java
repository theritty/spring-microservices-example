package com.example.microservices.client.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientTwoApplication.class, args);
    }
}
