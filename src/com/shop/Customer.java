package com.shop;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Customer(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public String getName() {
        return name;
    }

}
