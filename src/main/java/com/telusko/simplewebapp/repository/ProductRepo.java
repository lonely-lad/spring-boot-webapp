package com.telusko.simplewebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.simplewebapp.models.product;

@Repository
public interface ProductRepo extends JpaRepository<product, Integer> {
    // This interface will handle database operations for products
    // It extends JpaRepository to provide CRUD operations
    // You can add custom query methods if needed

}
