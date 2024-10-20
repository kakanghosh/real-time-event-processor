package com.example.eventwebproducer.controller;

import com.example.service.ProductEventProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventProducerController {

    private final ProductEventProducerService productEventProducerService;
}
