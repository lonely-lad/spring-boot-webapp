package com.telusko.simplewebapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.simplewebapp.models.product;
import com.telusko.simplewebapp.servises.productservices;
@RestController
public class productcontroller {

    // This class will handle product-related functionality
    // Currently, it is empty and can be implemented later
    // For example, you can add methods to handle product requests
    // and return appropriate responses based on product data.
    @Autowired
    productservices service;
    // Placeholder method for product listing
    @RequestMapping("/products")
    public List<product> getProducts() {
        return service.getAllProducts();
    }
}
