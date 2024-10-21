package com.example.eventwebproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.service", "com.example.eventwebproducer"})
public class EventWebProducer {

    public static void main(String[] args) {
        new SpringApplication(EventWebProducer.class).run(args);
    }
}
