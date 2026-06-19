package com.raushtech.WebApp.controllers;


import com.raushtech.WebApp.models.Product;
import com.raushtech.WebApp.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductsById(@PathVariable int prodId){
        return productService.getProductsById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        productService.addProduct(product);
    }



    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        System.out.println("in here in update product"+product);
        productService.updateProduct(product);
    }


    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }



}
