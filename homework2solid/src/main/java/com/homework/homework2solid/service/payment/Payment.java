package com.homework.homework2solid.service.payment;

import com.homework.homework2solid.model.checkout.Bill;

public interface Payment {
    boolean isAcceptable(Bill bill);
    void pay(Bill bill);
}
