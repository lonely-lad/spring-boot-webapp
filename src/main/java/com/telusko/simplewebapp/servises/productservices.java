package com.telusko.simplewebapp.servises;

import java.util.Arrays;
import java.util.List;

import com.telusko.simplewebapp.models.product;

public class productservices {

    List<product> products=Arrays.asList(new product(101,"iphone",50000));
    public List<product> getAllProducts() {
        // Implementation to retrieve all products
        return null; // Placeholder return
    }
}