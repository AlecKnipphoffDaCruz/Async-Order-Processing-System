package com.project.Async.Order.Processing.System.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.Async.Order.Processing.System.Entitys.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

    
}
