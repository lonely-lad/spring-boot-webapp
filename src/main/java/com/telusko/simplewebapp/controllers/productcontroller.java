package com.telusko.simplewebapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.simplewebapp.models.product;
import com.telusko.simplewebapp.servises.productservices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class productcontroller {

    // This class will handle product-related functionality
    // Currently, it is empty and can be implemented later
    // For example, you can add methods to handle product requests
    // and return appropriate responses based on product data.
    @Autowired
    productservices service;
    // Placeholder method for product listing
    @GetMapping("/products")
    public List<product> getProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/products/{prodid}")
    public product getProductById(@PathVariable int prodid) {
        return service.getProductById(prodid);
}
    @PostMapping("/products")
    public void addProduct(@RequestBody product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct( @RequestBody product prod) {
        service.updateProduct(prod);
        
        // This method can be used to update an existing product
    }

    @DeleteMapping("/products")
    public void deleteProduct(@RequestBody product prod) {
        // This method can be used to delete a product
        service.deleteProduct(prod);
    
}
}
