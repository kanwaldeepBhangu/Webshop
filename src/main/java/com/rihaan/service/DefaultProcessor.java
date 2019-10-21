package com.rihaan.service;

public interface DefaultProcessor {
    public default DefaultProcessor getInstance() {
        return new CSVFileReader();
    }
}
