package com.homework.homework2solid.service.payment;

import java.util.List;

import com.homework.homework2solid.model.checkout.Bill;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PaymentStrategy {
        private final List<Payment> payments;

        public void pay(Bill bill){
            payments.stream()
                    .filter(payment -> payment.isAcceptable(bill))
                    .findFirst()
                    .ifPresent(p -> 
                     p.pay(bill));
        }
}
