package com.walmart.app.controller;

import com.walmart.app.model.CartItem;
import com.walmart.app.repository.CartRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    private final CartRepository cartRepo;

    public CartController(CartRepository cartRepo) {
        this.cartRepo = cartRepo;
    }

    @GetMapping
    public List<CartItem> viewCart() {
        return cartRepo.findAll();
    }

    @PostMapping
    public CartItem addToCart(@RequestBody CartItem item) {
        return cartRepo.save(item);
    }
}
