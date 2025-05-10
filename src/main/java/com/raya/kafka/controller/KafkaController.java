package com.raya.kafka.controller;

import com.raya.kafka.service.producer.KafkaProducer;
import com.raya.kafka.utils.Constants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam String message) {
        producer.send(Constants.KAFKA_TOPIC, message);
        return ResponseEntity.ok("Message sent to Kafka: " + message);
    }
}
