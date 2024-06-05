package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("1","TV", 22,3);
        Product product2 = new Product("2","PC", 33,2);
        Product product3 = new Product("3","Laptop", 43,2);

        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);

       // System.out.println(productRepo.getAllProducts());
       // System.out.println(productRepo.getProduct("1"));
       // System.out.println(productRepo.getProduct("3"));

        OrderListRepo orderListRepo = new OrderListRepo();

        ShopService shopService = new ShopService(orderListRepo,productRepo);

        System.out.println();

        List<String> newOrder = new ArrayList<>();
        newOrder.add("1");
        newOrder.add("2");
        System.out.println(newOrder);

        shopService.placeNewOrder("1",newOrder);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter a Command: 'add_Product', 'remove_Product', 'list_Products', 'place_Order', 'list_orders', 'quit' \n");
            String command = input.nextLine();

            switch(command) {
                case "add_Product":
                    System.out.println("Enter a ProductID: ");
                    String productID = input.nextLine();
                    System.out.println("Enter a name: ");
                    String productName = input.nextLine();
                    System.out.println("Enter a price: ");
                    int productPrice = input.nextInt();
                    System.out.println("Enter a quantity: ");
                    int productQty = input.nextInt();
                    productRepo.addProduct(new Product(productID,productName, productPrice,productQty));
                    System.out.println("Product "+productName+" has been added successfully");
                    break;

                case "remove_Product":
                    System.out.println("Enter a ProductID: ");
                    String removeProductID = input.nextLine();
                    productRepo.removeProduct(productRepo.getProduct(removeProductID));

                    break;
                case "list_Products":
                    System.out.println("not ready yet. Under construction");
                    break;
                case "place_Order":
                    System.out.println("not ready yet. Under construction");
                    break;
                case "list_orders":
                    System.out.println("not ready yet. Under construction");
                    break;
                case "quit":
                    System.out.println("Exiting the system.");
                    input.close();
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }

    }
}