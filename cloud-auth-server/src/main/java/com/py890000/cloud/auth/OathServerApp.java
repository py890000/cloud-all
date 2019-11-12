package com.py890000.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class OathServerApp {
    public static void main(String[] args) {
        SpringApplication.run(OathServerApp.class, args);
    }

}
