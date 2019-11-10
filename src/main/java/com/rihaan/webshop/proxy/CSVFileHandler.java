package com.rihaan.webshop.proxy;

import com.opencsv.CSVReader;
import com.rihaan.webshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CSVFileHandler {

    @Autowired
    ResourceLoader resourceLoader;

    public List<Product> readAllExample() throws Exception {
        Reader reader=new InputStreamReader(resourceLoader.getResource("classpath:csv/source.csv").getInputStream());
        return readCsvFileLineByLine(reader);
    }

    public List<Product> readCsvFileLineByLine(Reader reader) throws Exception {
        List<Product> productList=new ArrayList<>();
        CSVReader csvReader = new CSVReader(reader);
        String[] line;
        while ((line = csvReader.readNext()) != null) {
            productList.add(new Product(line[0],line[1]));
        }
        reader.close();
        csvReader.close();
        return productList;
    }

}
