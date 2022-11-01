package com.example.microservices.client.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTwoController {
    @Value("${server.port}")
    private String portNumber;

    @RequestMapping("/info")
    public String greeting() {
        return String.format("Hello from 'client Two with Port Number %s'!", portNumber);

    }
}
