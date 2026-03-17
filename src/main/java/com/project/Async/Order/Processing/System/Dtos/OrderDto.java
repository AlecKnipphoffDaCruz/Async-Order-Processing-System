package com.project.Async.Order.Processing.System.Dtos;

import java.util.List;

import com.project.Async.Order.Processing.System.Entitys.Item;

public record OrderDto(
    String Id, 
    String customerId,
    List<Item> listItems,
    Float price
) {
}
