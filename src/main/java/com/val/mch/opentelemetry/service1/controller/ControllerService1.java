package com.val.mch.opentelemetry.service1.controller;

import com.val.mch.opentelemetry.service1.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerService1 {

    @Autowired
    private ServiceService serviceService;


    @GetMapping(value = "service1")
    public String callService2() throws InterruptedException {
        return serviceService.callService2();
    }

    @GetMapping(value = "error")
    public String callOnError()
    {
         throw new RuntimeException();
    }
}
