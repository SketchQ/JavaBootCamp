package com.homework.homework2solid.model.checkout;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bill {
    private List<BillItem> billItems;
    private double totalPrice;
}
