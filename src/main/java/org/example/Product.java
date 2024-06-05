package org.example;

//Step 1: Create a record Product with the necessary attributes.
public record Product(String product_id, String name, int price, int quantity) {
}
