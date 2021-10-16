package com.homework.homework2solid.model.Cart;

import com.homework.homework2solid.model.Product;
import com.homework.homework2solid.model.Seller;
import com.homework.homework2solid.service.discount.Discount;

import lombok.Data;

@Data
public class CartItem {
    private Product product;
    private int quantity;
    private Seller seller;
    private Discount discount;

    public double getPrice(){
        if(discount != null){
            return discount.applyDiscount(this);
        }
        return getPrice();
    }
}
