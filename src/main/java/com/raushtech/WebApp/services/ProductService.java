package com.raushtech.WebApp.services;

import com.raushtech.WebApp.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    //here asList is immutable so make it muttable we can use arrayList here
    private List<Product> products = new ArrayList<>(Arrays.
            asList(new Product(1,"Pen",20.0)
                    ,new Product(2,"Bags",500.0),
                    new Product(3,"Swords",100.0),
                    new Product(4,"Shoes",200.0),
                    new  Product(5,"Shoes",300.0)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductsById(int prodId){
        return products.stream()
                .filter(p -> p.getId()==prodId)
                .findFirst().orElse(new Product(100,"No Item",0.0));
    }


    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index=0;
        for (int i=0;i< products.size();i++){
            if(products.get(i).getId()==product.getId())
                index=i;
            products.set(index,product);
        }
    }


    public void deleteProduct(int prodId) {
        int index=0;
        for (int i=0;i< products.size();i++){
            if(products.get(i).getId()==prodId)
                index=i;
            products.remove(index);
        }
    }
}
