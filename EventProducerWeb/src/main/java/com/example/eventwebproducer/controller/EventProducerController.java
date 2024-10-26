package com.example.eventwebproducer.controller;

import com.example.dto.web.eventproducer.in.EventMessageInput;
import com.example.service.ProductEventProducerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Event Producer", description = "Help to produce event to kafka")
@RestController
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventProducerController {

    private final ProductEventProducerService productEventProducerService;

    @Operation(summary = "Create new event", description = "Create new event")
    @PostMapping
    public ResponseEntity<Void> createNewEvent(@RequestBody EventMessageInput eventMessageInput) {
        productEventProducerService.createNewEvent(eventMessageInput);
        return ResponseEntity.ok().build();
    }
}
