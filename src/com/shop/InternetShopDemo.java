package com.shop;

import com.shop.products.Phone;
import com.shop.products.Television;

public class InternetShopDemo {

    public static void main (String[] args){


        Seller seller1 = new Seller("Stock");
        Phone phone1 = new Phone("Apple iPhone 8", 15000, "diagonal - 4.7, RAM - 2 GB");
        Television television1 = new Television("Samsung QE5596", 47000, "diagonal - 55");
        seller1.addProduct(phone1);
        seller1.addProduct(television1);



        Seller seller2 = new Seller("Warehouse");
        Phone phone2 = new Phone("Apple iPhone 6", 8500, "diagonal - 4.7, RAM - 1 GB");
        Television television2 = new Television("Sony KDL43", 20000, "diagonal - 43");
        seller2.addProduct(phone2);
        seller2.addProduct(television2);

        Customer curtomer1 = new Customer("Василий Петров");

        Order order1 = new Order();
        order1.addProduct(seller1.getProducts().get(0));
        order1.addProduct(seller2.getProducts().get(1));
        curtomer1.addOrder(order1);
        System.out.println(curtomer1.getName() + ", ваш заказ: ");
        for (Order order: curtomer1.getOrders()) {
            order.show();
        }

        Customer curtomer2 = new Customer("Мерри Попинз");

        Order order2 = new Order();
        order2.addProduct(seller1.getProducts().get(1));
        order2.addProduct(seller2.getProducts().get(0));
        curtomer2.addOrder(order2);
        System.out.println(curtomer2.getName() + ", ваш заказ: ");
        for (Order order: curtomer2.getOrders()) {
            order.show();
        }
    }
}
