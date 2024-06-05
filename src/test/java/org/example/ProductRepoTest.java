package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void getProduct() {
            }
    @Test
    void addProduct_shouldReturnTrue_WhenAddSameProduct() {
        //GIVEN
        ProductRepo expected = new ProductRepo();
        Product product1 = new Product("1","TV", 22.22F,3);
        Product product2 = new Product("1","TV", 22.22F,3);
        expected.addProduct(product1);
        //WHEN

        ProductRepo actual = new ProductRepo();
        actual.addProduct(product2);
        //THEN
        assertEquals(expected, actual);



    }
    @Test
    void removeProduct_shouldReturnTrue_WhenRemoveProduct() {
        //GIVEN
        ProductRepo expected = new ProductRepo();
        Product product1 = new Product("1","TV", 22.22F,3);
        Product product2 = new Product("1","TV", 22.22F,3);
        expected.addProduct(product1);

        //WHEN

        ProductRepo actual = new ProductRepo();
        actual.addProduct(product2);
        actual.addProduct(product1);
        actual.removeProduct(product1);
        //THEN
        assertEquals(expected, actual);


    }


}