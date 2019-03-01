package com.example.vaultclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class DockerKubeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerKubeApplication.class, args);
    }

    @GetMapping
    public String helloWorld() throws UnknownHostException {
        return "Hello from " + InetAddress.getLocalHost().getHostName();
    }
}