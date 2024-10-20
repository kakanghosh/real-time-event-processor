package com.example.eventconsumerworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventConsumerWorker {

    public static void main(String[] args) {
        new SpringApplication(EventConsumerWorker.class).run(args);
    }
}
