package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Step 10: Create a class OrderMapRepo through which we can place new orders.
Step 11: This class should also implement the OrderRepo interface.
Step 12: In the main method, create either the OrderMapRepo or the OrderListRepo and pass it to the constructor of ShopService (as a constructor parameter that uses the interface).
 */
public class OrderMapRepo implements OrderRepo {

    private Map<String, Order> orders;

    public OrderMapRepo(){
        this.orders = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        orders.put(order.order_id(),order);
        System.out.println("Order with ID " + order.order_id() + " added.");

    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order.order_id());
        System.out.println("Order with ID " + order.order_id() + " removed.");

    }

    @Override
    public Order getOrder(String orderId) {

            if(orders.containsKey(orderId)) {
                System.out.println("Order with ID " + orderId + " retrieved.");
                return orders.get(orderId);
            }
        System.out.println("Order with ID " + orderId + " not found.");
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        System.out.println("Listing all orders: " + orders.size() + " found.");
        return new ArrayList<>(orders.values());
    }
}
