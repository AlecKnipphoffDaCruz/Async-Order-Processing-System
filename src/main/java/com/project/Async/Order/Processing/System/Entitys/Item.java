package com.project.Async.Order.Processing.System.Entitys;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    
    @Id
    @NotNull
    String id;

    @NotNull
    Integer quantity;

    @NotNull
    Float price;

}
