package com.demo.publisher;

import com.demo.config.MessagingConfig;
import com.demo.dto.Order;
import com.demo.dto.OrderDetails;
import com.demo.enums.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class Producer {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        order.setOrderId(UUID.randomUUID().toString());

        OrderDetails orderDetails = new OrderDetails(order, OrderStatus.PROCESS, "order attached successfully to " + restaurantName);

        convertTo(orderDetails, "XML");

        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, orderDetails);

        return "Success !!";
    }

    private static void convertTo(final OrderDetails orderDetails, final String type) {
        //convert to specific type
    }

}
