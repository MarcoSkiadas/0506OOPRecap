package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Create a class ProductRepo that contains a list of Product objects.


Step 2: Implement the ProductRepo class with a list to store products.
Step 3: Implement methods to add, remove, and get products (single product and all products).
 */
public class ProductRepo {

    List<Product> products;

    public ProductRepo() {
        this.products = new ArrayList<Product>();
    }

    public List<Product> getAllProducts() {
        System.out.println("Listing all products: " + products.size() + " found.");
        return products;
    }
    public Product getProduct(String productId) {
        for (Product p : products) {
            if (p.product_id().equals(productId)) {
                System.out.println("Product with ID " + productId + " retrieved.");
                return p;
            }

        }
        System.out.println("Product with ID " + productId + " not found.");
        return null;
    }
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product with ID " + product.product_id() + " added.");
    }
    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Product with ID " + product.product_id() + " removed.");
    }
    }
