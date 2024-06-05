package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void CreateATestProduct() {
        //Given
        Product expected = new Product();
        //When
        Product actual = new Product();
        //Then
        assertEquals(expected, actual);
    }

}