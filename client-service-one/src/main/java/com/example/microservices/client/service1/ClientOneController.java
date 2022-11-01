package com.example.microservices.client.service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientOneController {
    @Value("${server.port}")
    private String portNumber;

    @RequestMapping("/info")
    public String greeting() {
        return String.format("Hello from 'client One with Port Number %s'!", portNumber);

    }
}
