package com.example.eventconsumerworker.listener;

import com.example.Topics;
import com.example.dto.kafka.NewMessageEvent;
import com.example.eventconsumerservice.service.AddEventServiceProcessor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class EventAddListener {

    private final AddEventServiceProcessor addEventServiceProcessor;

    @KafkaListener(
            topics = Topics.PRODUCT_EVENT_ADDED,
            groupId = "${spring.kafka.consumer-group}",
            containerFactory = "kafkaListenerContainerFactory",
            concurrency = "2"
    )
    public void consume(ConsumerRecord<String, NewMessageEvent> record) {
        NewMessageEvent event = record.value();
        addEventServiceProcessor.process(event);
    }
}
