/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2019.
 */

package ch.sbb.ausbildungscamp.alert;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AlertListener {

    private final ObjectMapper objectMapper;

    public AlertListener(final ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = {"fahrzeit.updates"}, groupId = "alertListener", errorHandler = "alertErrorHandler")
    public void receiveMessage(final ConsumerRecord<String, String> record) {
    }


}
