package com.project.Async.Order.Processing.System.Message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendOrderCreated(String orderId){

        rabbitTemplate.convertAndSend(
            "order.created",
            orderId
        );
    }
}
