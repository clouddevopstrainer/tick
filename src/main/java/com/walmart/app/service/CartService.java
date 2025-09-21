package com.walmart.app.service;

import com.walmart.app.model.CartItem;
import com.walmart.app.repository.CartRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {
    private final CartRepository cartRepo;

    public CartService(CartRepository cartRepo) {
        this.cartRepo = cartRepo;
    }

    public List<CartItem> viewCart() {
        return cartRepo.findAll();
    }

    public CartItem addToCart(CartItem item) {
        return cartRepo.save(item);
    }
}
