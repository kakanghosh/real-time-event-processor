package com.example.eventwebproducer.controller;

import com.example.dto.web.eventproducer.in.EventMessageInput;
import com.example.service.ProductEventProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventProducerController {

    private final ProductEventProducerService productEventProducerService;

    @PostMapping
    public ResponseEntity<Void> createNewEvent(@RequestBody EventMessageInput eventMessageInput) {
        productEventProducerService.createNewEvent(eventMessageInput);
        return ResponseEntity.ok().build();
    }
}
