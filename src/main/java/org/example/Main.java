package org.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("1","TV", 22.22F,3);
        Product product2 = new Product("2","PC", 33.33F,2);
        Product product3 = new Product("3","Laptop", 43.33F,2);

        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);

        System.out.println(productRepo.getAllProducts());
        System.out.println(productRepo.getProduct("1"));
        System.out.println(productRepo.getProduct("3"));


    }
}