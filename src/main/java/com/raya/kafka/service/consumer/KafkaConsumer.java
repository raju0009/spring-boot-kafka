package com.raya.kafka.service.consumer;

import com.raya.kafka.utils.Constants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = Constants.KAFKA_TOPIC, groupId = Constants.KAFKA_TOPIC)
    public void listen(String message) {
        System.out.println("Message Listened from topic: " + message);
    }
}
