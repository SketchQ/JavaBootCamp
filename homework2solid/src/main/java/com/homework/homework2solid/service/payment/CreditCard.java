package com.homework.homework2solid.service.payment;

import com.homework.homework2solid.model.checkout.Bill;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CreditCard implements Payment {
    @Override
    public boolean isAcceptable(Bill bill){
        return bill.getTotalPrice() >= 1000;
    }
    
    @Override
    public void pay(Bill bill){
        double comission = bill.getTotalPrice() * 0.01;
        double price = bill.getTotalPrice() * comission;

        System.out.printf("Credit Cart payment completed. " + "Commission charge: %s " + "Commision Rate: %s " + "Payment after Commision: %s " , comission, 0.01, price);
    }
}
