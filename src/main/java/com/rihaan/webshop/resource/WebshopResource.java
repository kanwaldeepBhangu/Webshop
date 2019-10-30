package com.rihaan.webshop.resource;

import com.rihaan.webshop.model.Product;
import com.rihaan.webshop.service.WebshopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebshopResource {

    WebshopService service =new WebshopService();
    @GetMapping("/get/Allproducts")
    public List<Product> getUsers() {
        return service.productList();
    }
}
