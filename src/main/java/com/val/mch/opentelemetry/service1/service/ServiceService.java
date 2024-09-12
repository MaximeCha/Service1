package com.val.mch.opentelemetry.service1.service;

import com.val.mch.opentelemetry.service1.entity.ServiceEntity;
import com.val.mch.opentelemetry.service1.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static java.lang.Thread.sleep;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private RestClient restClient;

    public String callService2() throws InterruptedException {
        sleep(5000);
        serviceRepository.save(new ServiceEntity("myMessage"));
        return restClient.get().uri("http://service2:8082/service2").retrieve().body(String.class);
    }

}
