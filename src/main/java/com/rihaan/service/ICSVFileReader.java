package com.rihaan.service;

import com.rihaan.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ICSVFileReader extends DefaultProcessor {


    public default  List<Product>  readCsvFile(String csvFile)  {
        String line = "";
        String cvsSplitBy = ",";
        List<Product> products=new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] productLine = line.split(cvsSplitBy);
                products.add(
                        new Product(productLine[0],
                        productLine[1],
                        Double.parseDouble(productLine[2])))
                        ;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
