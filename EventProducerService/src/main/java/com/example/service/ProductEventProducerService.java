package com.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductEventProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
}
