package com.example.kafkahomework.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "topictopic")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message: " + message);
    }
}
