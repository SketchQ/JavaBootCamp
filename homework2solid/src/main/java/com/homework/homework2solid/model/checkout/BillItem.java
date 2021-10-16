package com.homework.homework2solid.model.checkout;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BillItem {
    private String productName;
    private double price;
    private double discountedprice;
    private int quantity;
    private String sellerName;
}
