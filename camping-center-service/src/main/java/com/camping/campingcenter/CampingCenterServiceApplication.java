package com.camping.campingcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CampingCenterServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CampingCenterServiceApplication.class, args);
    }
} 