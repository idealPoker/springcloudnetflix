package com.lwq.spring.cloud.netflix.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProviderAdminController {

    @Value(value = "${server.port}")
    private String port;

    @GetMapping("hi")
    public String sayHi(){
        return "Hi this is SpringCloud-Netflix,port:"+port;
    }
}
