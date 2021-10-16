package com.homework.homework2solid.service;


import java.util.List;
import java.util.stream.Collectors;

import com.homework.homework2solid.model.Cart.Cart;
import com.homework.homework2solid.model.checkout.Bill;
import com.homework.homework2solid.model.checkout.BillItem;

import org.springframework.stereotype.Service;


@Service
public class CheckoutService {
        public Bill checkout(Cart cart){
                List<BillItem> billItems = cart.getCartItems()
                        .stream()
                        .map(CartItem -> BillItem.builder()
                                .productName(CartItem.getProduct().getName())
                                .quantity(CartItem.getQuantity())
                                .sellerName(CartItem.getSeller().getName())
                                .price(CartItem.getPrice())
                                .build())
                        .collect(Collectors.toList());
                double totalSum = billItems.stream()
                        .map(BillItem::getDiscountedprice)
                        .mapToDouble(d -> d)
                        .sum();

                return Bill.builder()
                        .billItems(billItems)
                        .totalPrice(totalSum)
                        .build();
        }
}
