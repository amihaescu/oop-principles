package com.amihaescu.encapsulation;

import com.amihaescu.encapsulation.Product;
import com.amihaescu.encapsulation.Promotion;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {

    @Test
    void newProductEncapsulated() {
        Product product = new Product("Water", 1.50);
        product.getTitle().replace("a", "x");
        assertEquals("Water", product.getTitle());
    }

    @Test
    void newProductPriceSetter() {
        Product product = new Product("Water", 1.50);
        Double newPrice = 1.65;
        product.setPrice(newPrice);
        newPrice = 1.45;
        assertEquals(1.65, product.getPrice());
    }

    @Test
    void newProductPromotionsConstructor() {
        List<Promotion> promotionList = new ArrayList<>();
        promotionList.add(new Promotion());
        Product product = new Product("Water", 1.50, promotionList);
        assertEquals(1, product.getPromotions().size());
        promotionList.add(new Promotion());
        assertEquals(1, product.getPromotions().size());
    }

    @Test
    void newProductPromotionsSetter() {
        List<Promotion> promotionList = new ArrayList<>();
        promotionList.add(new Promotion());
        Product product = new Product("Water", 1.50);
        product.setPromotions(promotionList);
        assertEquals(1, product.getPromotions().size());
        promotionList.add(new Promotion());
        assertEquals(1, product.getPromotions().size());
    }

    @Test
    void newProductPromotionsGetter() {
        List<Promotion> promotionList = new ArrayList<>();
        promotionList.add(new Promotion());
        Product product = new Product("Water", 1.50, promotionList);
        assertEquals(1, product.getPromotions().size());
        assertThrows(UnsupportedOperationException.class, () ->
                product.getPromotions().add(new Promotion())
        );
        assertEquals(1, product.getPromotions().size());
    }

    @Test
    void getActivePromotions() {
        List<Promotion> promotionList = new ArrayList<>();
        Promotion activePromotion = new Promotion(0.65,
                LocalDate.of(2020, 1,1),
                LocalDate.of(2020, 2, 28));
        Promotion inactivePromotion = new Promotion(0.15,
                LocalDate.of(2020, 3,1),
                LocalDate.of(2020, 3, 28));
        LocalDate now = LocalDate.of(2020, 2, 1);
        promotionList.add(inactivePromotion);
        promotionList.add(activePromotion);
        Product product = new Product("Water", 1.50, promotionList);

        assertEquals(1, product.getActivePromotions(now).size());
        assertEquals(activePromotion, product.getActivePromotions(now).get(0));

    }
}
