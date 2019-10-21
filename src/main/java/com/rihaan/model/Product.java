package com.rihaan.model;

public class Product {
    String id;
    String description;
    double price;

    public Product(String id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
