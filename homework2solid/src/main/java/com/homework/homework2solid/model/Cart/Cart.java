package com.homework.homework2solid.model.Cart;

import java.util.ArrayList;
import java.util.List;



public class Cart {
    private final List<CartItem> cartItems;

    public Cart(){
        this.cartItems = new ArrayList<>();
    }

    public void addItem(CartItem cartItem){
        cartItems.add(cartItem);
    }
    public List<CartItem> getCartItems(){
        return cartItems;
    }
}
