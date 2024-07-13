package com.example.kafkahomework;

import com.example.kafkahomework.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaHomeworkApplication {

    @Autowired
    private Producer producer;

    public static void main(String[] args) {
        SpringApplication.run(KafkaHomeworkApplication.class, args);
    }


    // for example
    @Bean
    public Object sender() {
        for (int i = 0; i < 100; i++) {
            producer.sendMessage("example");
        }

        return new Object();
    }

}
