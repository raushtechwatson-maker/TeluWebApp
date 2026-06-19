package com.raushtech.WebApp.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String prodName;
    private double price;
}
