package com.val.mch.opentelemetry.service1.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumeMessageService {

    @RabbitListener(queues = "someQueue")
    public void consumeMessage(String messageBody) {
        log.info("Consumed Message: " + messageBody);
    }
}
