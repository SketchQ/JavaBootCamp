package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary

public class PercentageDiscount implements DiscountService {
    @Override
    public void discount(){
        System.out.println("PercentageDiscount");
    }
}
