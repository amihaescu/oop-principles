package com.amihaescu.encapsulation;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PromotionTest {

    @Test
    void promotionShouldBeActive(){
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2020, 2, 28);
        LocalDate currentDate = LocalDate.of(2020, 2, 1);
        Promotion promotion = new Promotion(0.15, startDate, endDate);

        assertTrue(promotion.isActive(currentDate));
    }

    @Test
    void promotionShouldBeInactive(){
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2020, 2, 28);
        LocalDate currentDate = LocalDate.of(2019, 2, 1);
        Promotion promotion = new Promotion(0.15, startDate, endDate);

        assertFalse(promotion.isActive(currentDate));
    }

    @Test
    void promotionShouldBeActiveNow(){
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusDays(1);
        LocalDate endDate = now.plusDays(1);
        Promotion promotion = new Promotion(0.15, startDate, endDate);

        assertTrue(promotion.isActive());

    }
}
