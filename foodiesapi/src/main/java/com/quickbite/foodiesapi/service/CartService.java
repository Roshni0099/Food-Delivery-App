package com.quickbite.foodiesapi.service;

import com.quickbite.foodiesapi.io.CartRequest;
import com.quickbite.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
