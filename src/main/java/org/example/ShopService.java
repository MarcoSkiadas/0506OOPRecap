package org.example;

import java.util.ArrayList;
import java.util.List;

/*
Create a class ShopService through which we can place new orders.

Step 7: Implement a method to place a new order.
Step 8: Check if the ordered products exist. If not, print a System.out.println message.
 */
public class ShopService {
    private OrderListRepo orderRepo;
    private ProductRepo productRepo;
    private String nextOrderId = "1";

    public ShopService(OrderListRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    public void placeNewOrder(String customerId, List<String> productsID){
        List<Product> items = new ArrayList<Product>();
        int total_amount = 0;

        for(String productID : productsID){
            if(productRepo.getProduct(productID)!=null) {
                Product product = productRepo.getProduct(productID);
                items.add(product);
                total_amount += product.price();
            }
            else {
                System.out.println("Product with ID " + productID + " does not exist.");
            }
        }
        Order order = new Order(nextOrderId+1,customerId,items,total_amount);
        System.out.println(order);
    }

}
