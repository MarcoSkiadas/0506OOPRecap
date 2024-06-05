package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void addProduct_shouldReturnTrue_WhenAddSameProduct() {
        //GIVEN
        Product expected = new Product("1","TV", 22,3);
        //WHEN
        ProductRepo repo =new ProductRepo();
        repo.addProduct(expected);
        //THEN
        assertEquals(expected, repo.getProduct(expected.product_id()));
    }
    @Test
    void removeProduct_shouldReturnTrue_WhenRemoveProduct() {
        //GIVEN
        ProductRepo expected = new ProductRepo();
        Product product1 = new Product("1","TV", 22,3);
        Product product2 = new Product("1","TV", 22,3);
        expected.addProduct(product1);
        //WHEN
        ProductRepo actual = new ProductRepo();
        actual.addProduct(product2);
        actual.addProduct(product1);
        actual.removeProduct(product2);
        //THEN
        assertEquals(expected, actual);


    }
    @Test
    void getAllProducts_ShouldReturnAllProducts(){
        //Given
        Product expected1 = new Product("1","TV", 22,3);
        Product expected2 = new Product("2","PC", 22,3);
        List<Product> expected = new ArrayList<Product>();
        expected.add(expected1);
        expected.add(expected2);
        //WHEN
        ProductRepo repo =new ProductRepo();
        repo.addProduct(expected1);
        repo.addProduct(expected2);
        //Then
        assertEquals(expected,repo.products);
    }
    @Test
    void getProducts_ShouldReturnTrue_WhenCalledWithCorrectProduct(){
        Product expected1 = new Product("1","TV", 22,3);
        Product expected = new Product("2","PC", 22,3);

        //WHEN
        ProductRepo repo =new ProductRepo();
        repo.addProduct(expected1);
        repo.addProduct(expected);
        Product actual = repo.getProduct("2");

        assertEquals(expected,actual);
    }
    @Test
    void getProducts_ShouldReturnFalse_WhenCalledWithIncorrectProduct() {
        Product expected1 = new Product("1", "TV", 22, 3);
        Product expected = new Product("2", "PC", 22, 3);

        //WHEN
        ProductRepo repo = new ProductRepo();
        repo.addProduct(expected1);
        repo.addProduct(expected);
        Product actual = repo.getProduct("1");

        assertNotEquals(expected, actual);
    }

}