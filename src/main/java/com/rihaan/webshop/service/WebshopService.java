package com.rihaan.webshop.service;

import com.rihaan.webshop.model.Product;
import com.rihaan.webshop.proxy.CSVFileHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WebshopService {

    @Autowired
    CSVFileHandler csvFileHandler;

    public List<Product> productList() {
        try {
            return csvFileHandler.readAllExample();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
