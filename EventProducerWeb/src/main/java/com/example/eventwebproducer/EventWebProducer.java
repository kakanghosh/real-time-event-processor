package com.example.eventwebproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventWebProducer {

    public static void main(String[] args) {
        new SpringApplication(EventWebProducer.class).run(args);
    }
}
