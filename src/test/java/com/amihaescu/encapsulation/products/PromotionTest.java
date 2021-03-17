package com.amihaescu.encapsulation.products;

import com.amihaescu.encapsulation.products.Promotion;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PromotionTest {

    @Test
    void promotion_should_be_active() {
        var startDate = LocalDate.of(2021,3,1);
        var endDate = LocalDate.of(2321,4,1);
        var promotion = new Promotion(0.15, startDate, endDate);
        assertTrue(promotion.isActive());
    }

    @Test
    void promotion_should_be_active_at_certain_date() {
        var startDate = LocalDate.of(2021,3,1);
        var endDate = LocalDate.of(2321,4,1);
        var now = LocalDate.now();
        var promotion = new Promotion(0.15, startDate, endDate);
        assertTrue(promotion.isActive(now));
    }
}
