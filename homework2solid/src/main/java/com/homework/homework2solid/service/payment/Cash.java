package com.homework.homework2solid.service.payment;

import com.homework.homework2solid.model.checkout.Bill;

import org.springframework.stereotype.Component;

@Component
public class Cash implements Payment {
    @Override
    public boolean isAcceptable(Bill bill){
        return true;
    }

    @Override
    public void pay(Bill bill){
        System.out.println("Payment complete with cash, Total Price: " + bill.getTotalPrice());
    }
}
