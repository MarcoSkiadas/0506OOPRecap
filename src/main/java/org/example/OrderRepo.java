package org.example;

import java.util.List;

// Step 9: Create an OrderRepo interface with the methods from the OrderListRepo (add, remove, and getSingle, getAll).
public interface OrderRepo {

    void addOrder(Order order);
    void removeOrder(Order order);
    Order getOrder(String orderId);
    List<Order> getAllOrders();
}
