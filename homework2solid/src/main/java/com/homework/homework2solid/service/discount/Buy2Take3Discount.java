package com.homework.homework2solid.service.discount;

import com.homework.homework2solid.model.Cart.CartItem;

public class Buy2Take3Discount implements Discount {
    @Override
    public double applyDiscount(CartItem cartItem){
        int discountQuantity = cartItem.getQuantity() / 3;
        int paidQuantity = cartItem.getQuantity() - discountQuantity;
        return paidQuantity * cartItem.getProduct().getPrice();

    }
    
}
