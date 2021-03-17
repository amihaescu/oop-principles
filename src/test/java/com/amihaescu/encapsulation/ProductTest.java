package com.amihaescu.encapsulation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {

    @Test
    void new_product_constructor() {
        Product product = new Product("Coffee", 1.50);
        assertEquals("Coffee", product.getTitle());
        assertEquals(1.50, product.getPrice());
    }

    @Test
    void new_product_encapsulated() {
        Product product = new Product("Coffee", 1.50);
        product.getTitle().replace("o", "x");
        assertEquals("Coffee", product.getTitle());
    }

    @Test
    void new_product_promotion_list() {
        var promotions = new ArrayList<Promotion>();
        promotions.add(new Promotion());
        var product = new Product();
        product.setPromotions(promotions);
        assertEquals(1, product.getPromotions().size());
        promotions.add(new Promotion());
        assertEquals(1, product.getPromotions().size());
    }

    @Test
    void product_get_promotion_list() {
        var promotions = new ArrayList<Promotion>();
        promotions.add(new Promotion());
        var product = new Product();
        product.setPromotions(promotions);
        assertEquals(1, product.getPromotions().size());
        assertThrows(UnsupportedOperationException.class, () ->product.getPromotions().add(new Promotion()));
    }
    
}
