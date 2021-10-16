package com.homework.homework2solid.service.discount;

import com.homework.homework2solid.model.Cart.CartItem;

public interface Discount {
    double applyDiscount(CartItem cartItem);
}
