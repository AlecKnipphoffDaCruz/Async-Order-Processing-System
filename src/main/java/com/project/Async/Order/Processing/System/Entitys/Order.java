package com.project.Async.Order.Processing.System.Entitys;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.Nullable;
import com.project.Async.Order.Processing.System.Enums.OrderStatusEnum;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @NotNull
    String id;

    @Id
    @NotNull
    String customerId;

    @NotNull
    List<Item> items;

    OrderStatusEnum status;
    
    @NotNull
    LocalDate createdAt;

    @Nullable
    LocalDate consumedAt;

    @Nullable
    LocalDate updateAt;


}
