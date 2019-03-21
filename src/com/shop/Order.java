package com.shop;

import com.shop.products.Product;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> products = new ArrayList<Product>();

    public double getSum() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public int getQuantity() {
        return products.size();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void show() {
        System.out.println("Товары: ");

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("Количество товаров в корзине: " + getQuantity());
        System.out.println("Сумма заказа " + getSum());
        System.out.println();
    }
}
