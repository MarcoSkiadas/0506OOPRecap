package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderListRepoTest {

    @Test
    void addOrder_shouldReturnTrue_WhenAddSameOrder() {
        //GIVEN
        Product product1 = new Product("1","TV", 22,3);
        Product product2 = new Product("2","PC",22,3);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Order expected = new Order("1","1",products,2);

        //WHEN
        OrderListRepo repo =new OrderListRepo();
        repo.addOrder(expected);
        //THEN
        assertEquals(expected, repo.getOrder(expected.order_id()));
    }
    @Test
    void removeOrder_shouldReturnTrue_WhenRemoveOrder() {
        //GIVEN
        Product product1 = new Product("1","TV", 22,3);
        Product product2 = new Product("2","PC",22,3);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Order expected = new Order("1","1",products,2);
        Order order1 = new Order("2","2",products,1);

        //WHEN
        OrderListRepo repo =new OrderListRepo();
        repo.addOrder(expected);
        repo.addOrder(order1);
        repo.removeOrder(order1);
        //THEN
        assertEquals(expected, repo.getOrder(expected.order_id()));


    }
    @Test
    void getAllOrders_ShouldReturnAllOrders(){
        Product product1 = new Product("1","TV", 22,3);
        Product product2 = new Product("2","PC",22,3);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Order order2 = new Order("1","1",products,2);
        Order order1 = new Order("2","2",products,1);

        OrderListRepo repo = new OrderListRepo();

        repo.addOrder(order2);
        repo.addOrder(order1);

        List<Order> result = repo.getAllOrders();

        assertEquals(2, result.size());


    }
    @Test
    void getOrders_ShouldReturnTrue_WhenCalledWithCorrectOrder(){
        Product product1 = new Product("1","TV", 22,3);
        Product product2 = new Product("2","PC",22,3);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Order order2 = new Order("1","1",products,2);
        Order order1 = new Order("2","2",products,1);

        OrderListRepo repo = new OrderListRepo();

        repo.addOrder(order2);
        repo.addOrder(order1);

        Order result = repo.getOrder("1");

        assertEquals(order2,result);

    }
    @Test
    void getOrders_ShouldReturnFalse_WhenCalledWithIncorrectOrder() {
        Product product1 = new Product("1","TV", 22,3);
        Product product2 = new Product("2","PC",22,3);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Order order2 = new Order("1","1",products,2);
        Order order1 = new Order("2","2",products,1);

        OrderListRepo repo = new OrderListRepo();

        repo.addOrder(order2);
        repo.addOrder(order1);

        Order result = repo.getOrder("1");

        assertNotEquals(order1,result);
    }

}