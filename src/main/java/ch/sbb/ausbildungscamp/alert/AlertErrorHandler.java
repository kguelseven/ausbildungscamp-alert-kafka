/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2019.
 */

package ch.sbb.ausbildungscamp.alert;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AlertErrorHandler implements ConsumerAwareListenerErrorHandler {

    @Override
    public Object handleError(final Message<?> message, ListenerExecutionFailedException exception, final Consumer<?, ?> consumer) {
        log.error("Error processing " + message, exception);
        return null;
    }
}
