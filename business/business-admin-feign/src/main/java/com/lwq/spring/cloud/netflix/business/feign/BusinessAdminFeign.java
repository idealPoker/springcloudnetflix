package com.lwq.spring.cloud.netflix.business.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import sun.awt.SunHints;

@FeignClient(value = "provider-admin")
public interface BusinessAdminFeign {


    @GetMapping(value = "hi")
    public String sayHi();
}
