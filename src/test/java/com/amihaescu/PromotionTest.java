package com.amihaescu;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PromotionTest {

    @Test
    void promotionShouldBeActive(){
        Promotion promotion = new Promotion(10.0,
                LocalDate.of(2020, 1,1),
                LocalDate.of(2020, 2,28));
        assertTrue(promotion.isActive(LocalDate.of(2020, 2,1)));
    }

}
