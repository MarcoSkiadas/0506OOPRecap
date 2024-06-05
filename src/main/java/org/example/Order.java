package org.example;

import java.util.List;

//Step 4: Create a record Order with the necessary attributes.
public record Order(String order_id, String customer_id, List<Product> products, int total_amount) {

}
