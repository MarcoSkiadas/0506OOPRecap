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
        return products;
    }
    public Product getProduct(Product product) {
        for (Product p : products) {
            if (p.equals(product)) {
                return product;
            }

        }
        return null;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }







    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(products);
    }
}
