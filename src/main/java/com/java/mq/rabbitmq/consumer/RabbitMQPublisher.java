package com.java.mq.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQPublisher {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void receiveMessage(String message) {
        LOGGER.info(String.format("Message received -> %s", message));
    }
}