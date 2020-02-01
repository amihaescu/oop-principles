package com.amihaescu;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {

    @Test
    void newProductSimpleEncapsulation(){
        Product product = new Product("Water", 1.50);
        product.getTitle().replace("a", "x");
        assertEquals("Water", product.getTitle());
    }

    @Test
    void newProductConstructorListEncapsulation(){
        List<Promotion> promotionList = new ArrayList<>();
        promotionList.add(new Promotion());
        Product product = new Product("Water", 1.50, promotionList);

        assertEquals(1, product.getPromotionList().size());
        promotionList.add(new Promotion());
        assertEquals(1, product.getPromotionList().size());
    }

    @Test
    void newProductSetterListEncapsulation(){
        List<Promotion> promotionList = new ArrayList<>();
        promotionList.add(new Promotion());
        Product product = new Product("Water", 1.50);
        product.setPromotionList(promotionList);
        assertEquals(1, product.getPromotionList().size());
        promotionList.add(new Promotion());
        assertEquals(1, product.getPromotionList().size());
    }

    @Test
    void newProductGetterListEncapsulation(){
        List<Promotion> promotionList = new ArrayList<>();
        Product water = new Product("Water", 1.50, promotionList);
        assertThrows(UnsupportedOperationException.class, () -> water.getPromotionList().add(new Promotion()));
        assertEquals(0, water.getPromotionList().size());
    }

    @Test
    void productActivePromotions(){
        List<Promotion> promotions = new ArrayList<>();
        LocalDate currentDate = LocalDate.of(2020, 2,1);
        Promotion activePromotion = new Promotion(10.0,
                LocalDate.of(2020,1,1),
                LocalDate.of(2020, 2,28));
        Promotion inactivePromotion = new Promotion(10.0,
                LocalDate.of(2020, 3, 1),
                LocalDate.of(2020, 3, 28));
        promotions.add(inactivePromotion);
        promotions.add(activePromotion);
        Product water = new Product("Water", 10.0, promotions);
        assertEquals(1, water.getActivePromotions(currentDate).size());
        assertEquals(activePromotion, water.getActivePromotions(currentDate).get(0));
    }


}
