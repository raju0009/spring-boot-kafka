package com.raya.kafka.config;

import com.raya.kafka.utils.Constants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createTopic() {
        return new NewTopic(Constants.KAFKA_TOPIC, 3, (short) 1); // 3 partitions, 1 replication factor
    }
}
