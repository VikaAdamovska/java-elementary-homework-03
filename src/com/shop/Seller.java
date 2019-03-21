package com.shop;

import com.shop.products.Product;

import java.util.ArrayList;

public class Seller {

    private String name;

    private ArrayList <Product> products = new ArrayList<Product>();

    public Seller(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }
}
