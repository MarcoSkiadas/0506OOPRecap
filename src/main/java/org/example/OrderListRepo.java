package org.example;
import java.util.ArrayList;
import java.util.List;
/*
Create a class OrderListRepo that contains a list of Order objects.

Step 5: Implement the OrderListRepo class with a list to store orders.
Step 6: Implement methods to add, remove, and (single order and all orders).
 */
public class OrderListRepo implements OrderRepo{
    List<Order> orders;

    public OrderListRepo() {
        orders = new ArrayList<>();
    }

    @Override
    public List<Order> getAllOrders() {
        System.out.println("Listing all orders: " + orders.size() + " found.");
        return orders;
    }
    @Override
    public Order getOrder(String orderId) {
        for (Order o : orders) {
            if (o.order_id().equals(orderId)) {
                System.out.println("Order with ID " + orderId + " retrieved.");
                return o;
            }

        }
        System.out.println("Order with ID " + orderId + " not found.");
        return null;
    }
    @Override
    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order with ID " + order.order_id() + " added.");
    }
    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
        System.out.println("Order with ID " + order.order_id() + " removed.");
    }




}
