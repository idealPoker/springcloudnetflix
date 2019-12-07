package com.lwq.spring.cloud.netflix.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaAdminApplication.class,args);
    }
}
