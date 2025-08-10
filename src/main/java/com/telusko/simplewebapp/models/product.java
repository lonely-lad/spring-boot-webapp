package com.telusko.simplewebapp.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Component
@Entity
public class product {
    @Id
    private int prodid;
    private String prodname;
    private int price;
    

    
}
