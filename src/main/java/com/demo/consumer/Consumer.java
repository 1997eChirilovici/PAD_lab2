package com.demo.consumer;

import com.demo.config.MessagingConfig;
import com.demo.dto.OrderDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderDetails orderDetails) {
        log.info(String.format("Message received from queue (%s). Details: %s", MessagingConfig.QUEUE, orderDetails));
    }

}
