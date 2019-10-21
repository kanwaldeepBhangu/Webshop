package com.rihaan.service;

import com.rihaan.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ICSVFileReader {

    public default  List<Product> createCache(String csvFilePath){
        List<Product> products=new ArrayList<Product>();
        return products;
    }
}
