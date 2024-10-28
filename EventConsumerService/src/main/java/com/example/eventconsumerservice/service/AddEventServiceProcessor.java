package com.example.eventconsumerservice.service;

import com.example.dto.kafka.NewMessageEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
@Slf4j
public class AddEventServiceProcessor {

    private final Random random;

    public void process(NewMessageEvent event) {
        try {
            TimeUnit.MILLISECONDS.sleep(random.nextLong(1000, 4000));
            var eventLag = Duration.between(event.getCreatedAt(), Instant.now());
            log.info("event lag: {}, Consumed event: ID= {}, event: {}, ", eventLag.getSeconds(), event.getId(), event);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
