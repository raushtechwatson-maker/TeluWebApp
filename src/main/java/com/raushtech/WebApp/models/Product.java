package com.raushtech.WebApp.models;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String prodName;
    private double price;
}
