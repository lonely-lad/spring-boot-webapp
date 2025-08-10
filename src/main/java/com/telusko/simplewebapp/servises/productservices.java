package com.telusko.simplewebapp.servises;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.simplewebapp.models.product;
import com.telusko.simplewebapp.repository.ProductRepo;
@Service
public class productservices {

    @Autowired
    ProductRepo repo;

//  List<product> products=new ArrayList<>( Arrays.asList(new product(101,"iphone",50000)
  //          ,new product(102,"samsung",30000)
    //        ,new product(103,"oneplus",25000)
      //      ,new product(104,"nokia",15000)));
    public List<product> getAllProducts() {
        // Implementation to retrieve all products
        return repo.findAll(); // Placeholder return
    }
    public product getProductById(int prodid) {
        // Implementation to retrieve a product by its ID
        return repo.findById(prodid).orElse(null); // Returns null if not found
    }
    public void addProduct(product prod) {
        repo.save(prod);
        
        
    }
    public void updateProduct(product prod) {
        repo.save(prod);
        // This will update the product if it exists, or add it if it doesn't    
        }
        // If product not found, you might want to handle it differently
        // For now, we just do nothing
    
    public void deleteProduct(product prod) {
        repo.delete(prod);  
        // This will remove the product if it exists in the list
    }
}