package com.example.service;

import com.example.dto.web.eventproducer.in.EventMessageInput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductEventProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void createNewEvent(EventMessageInput eventMessageInput) {
        log.info("{}", eventMessageInput);
    }
}
