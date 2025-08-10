package com.telusko.simplewebapp.servises;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.simplewebapp.models.product;
@Service
public class productservices {

    List<product> products=Arrays.asList(new product(101,"iphone",50000)
            ,new product(102,"samsung",30000)
            ,new product(103,"oneplus",25000)
            ,new product(104,"nokia",15000));
    public List<product> getAllProducts() {
        // Implementation to retrieve all products
        return products; // Placeholder return
    }
}