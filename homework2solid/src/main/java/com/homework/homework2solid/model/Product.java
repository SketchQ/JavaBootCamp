package com.homework.homework2solid.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private String name;
    private double price;
}
