package com.example.eventconsumerworker.listener;

import com.example.Topics;
import com.example.dto.kafka.NewMessageEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventAddListener {

    @KafkaListener(
            topics = Topics.PRODUCT_EVENT_ADDED,
            groupId = "${spring.kafka.consumer-group}",
            containerFactory = "kafkaListenerContainerFactory",
            concurrency = "2"
    )
    public void consume(ConsumerRecord<String, NewMessageEvent> record) {
        NewMessageEvent event = record.value();
        log.info("Consumed event: ID= {}, Type= {}, Body= {}", event.getId(), event.getType(), event.getBody());
    }
}
