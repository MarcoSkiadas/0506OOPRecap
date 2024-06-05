package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("1","TV", 22,3);
        Product product2 = new Product("2","PC", 33,2);
        Product product3 = new Product("3","Laptop", 43,2);

        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);

        System.out.println(productRepo.getAllProducts());
        System.out.println(productRepo.getProduct("1"));
        System.out.println(productRepo.getProduct("3"));

        OrderListRepo orderListRepo = new OrderListRepo();

        ShopService shopService = new ShopService(orderListRepo,productRepo);

        System.out.println();

        List<String> newOrder = new ArrayList<>();
        newOrder.add("1");
        newOrder.add("2");
        System.out.println(newOrder);

        shopService.placeNewOrder("1",newOrder);


    }
}