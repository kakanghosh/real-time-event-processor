package com.example.service;

import com.example.Topics;
import com.example.dto.kafka.NewMessageEvent;
import com.example.dto.web.eventproducer.in.EventMessageInput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductEventProducerService {

    private final KafkaTemplate<String, NewMessageEvent> kafkaTemplate;

    public void createNewEvent(EventMessageInput eventMessageInput) {
        var newMessage = new NewMessageEvent(1L, eventMessageInput.type(), "Random");
        kafkaTemplate.send(Topics.PRODUCT_EVENT_ADDED, eventMessageInput.type(), newMessage);
        log.info("{}", newMessage);
    }
}
