package com.project.Async.Order.Processing.System.Services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Async.Order.Processing.System.Dtos.OrderDto;
import com.project.Async.Order.Processing.System.Entitys.Order;
import com.project.Async.Order.Processing.System.Enums.OrderStatusEnum;
import com.project.Async.Order.Processing.System.Repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(OrderDto orderDto) {

        Order order = new Order();
        order.setId(orderDto.Id());
        order.setCustomerId(orderDto.customerId());
        order.setItems(orderDto.listItems());
        order.setStatus(OrderStatusEnum.CREATED);
        order.setCreatedAt(LocalDate.now());

        return order;
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }
}
