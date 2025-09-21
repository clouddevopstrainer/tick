package com.walmart.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cart")
public class CartItem {
    @Id
    private String id;
    private String productId;
    private int quantity;
}
