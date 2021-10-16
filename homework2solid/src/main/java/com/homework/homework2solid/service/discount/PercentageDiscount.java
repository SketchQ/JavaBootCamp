package com.homework.homework2solid.service.discount;

import com.homework.homework2solid.model.Cart.CartItem;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PercentageDiscount implements Discount {
    private final double discountAmount;

    public double getDiscountAmount() {
        return discountAmount / 100;

    }

    @Override
    public double applyDiscount(CartItem cartItem) {
        double price = cartItem.getProduct().getPrice() * cartItem.getQuantity();
        double appliedDiscount = price * getDiscountAmount();
        return price - appliedDiscount;
    }

}
