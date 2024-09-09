package com.val.mch.opentelemetry.Service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class ControllerService1 {

    @Autowired
    private RestClient restClient;


    @GetMapping(value = "service1")
    public String callService2()
    {
        return restClient.get().uri("http://localhost:8082/service2").retrieve().body(String.class);
    }
}
