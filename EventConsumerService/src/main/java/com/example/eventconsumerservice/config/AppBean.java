package com.example.eventconsumerservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AppBean {
    @Bean
    public Random random() {
        return new Random();
    }
}
