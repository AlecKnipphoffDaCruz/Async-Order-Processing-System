package com.project.Async.Order.Processing.System.Message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    
    @RabbitListener(queues = "order.created")
    public void processOrder(String orderId){
        System.out.println("Processing order " + orderId);
    }
}
