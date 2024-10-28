package com.example.eventconsumerworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.eventconsumerworker", "com.example.eventconsumerservice"})
public class EventConsumerWorker {

    public static void main(String[] args) {
        new SpringApplication(EventConsumerWorker.class).run(args);
    }
}
