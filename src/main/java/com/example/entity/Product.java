package com.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private String name;
    private String price;
    private int number;

    public Product(String name, String price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public Product() {
    }
}
