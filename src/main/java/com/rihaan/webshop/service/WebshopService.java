package com.rihaan.webshop.service;

import com.rihaan.webshop.model.Product;
import com.rihaan.webshop.proxy.CSVFileHandler;

import java.util.List;

public class WebshopService {

    public List<Product> productList() {
        try {
            return new CSVFileHandler().readAllExample();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
