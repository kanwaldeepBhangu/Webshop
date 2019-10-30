package com.rihaan.webshop.model;

public class Product {
    public Product() {
    }

    String product_code;
    String product_desc;

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public Product(String product_code, String product_desc) {
        this.product_code = product_code;
        this.product_desc = product_desc;
    }

}
