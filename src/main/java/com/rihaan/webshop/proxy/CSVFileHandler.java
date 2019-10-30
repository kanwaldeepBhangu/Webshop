package com.rihaan.webshop.proxy;

import com.opencsv.CSVReader;
import com.rihaan.webshop.model.Product;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVFileHandler {

    public List<Product> readAllExample() throws Exception {
        Reader reader = Files.newBufferedReader(Paths.get(
                ClassLoader.getSystemResource("csv/source.csv").toURI()));
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
