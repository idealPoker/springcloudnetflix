package com.lwq.spring.cloud.netflix.business.controller;

import com.lwq.spring.cloud.netflix.business.feign.BusinessAdminFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BusinessAdminController {

    @Resource
    private BusinessAdminFeign businessAdminFeign;

    @GetMapping(value = "hi")
    public String sayHi(){
        return businessAdminFeign.sayHi();
    }

}
