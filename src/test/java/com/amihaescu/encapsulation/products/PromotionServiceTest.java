package com.amihaescu.encapsulation.products;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PromotionServiceTest {

    @InjectMocks
    private PromotionService promotionService;

    @Mock
    private PromotionsRepo promotionsRepo;

    @Test
    public void test_promotion_isactive() {
        Promotion promotion = new Promotion(
                10.0, LocalDate.of(2020, 5, 1)
                , LocalDate.of(2020, 5, 30)
        );
        when(promotionsRepo.findById(anyLong())).thenReturn(Optional.of(promotion));
        assertFalse(promotionService.isPromotionActive(1l));
    }

    @Test
    public void test_promotion_isactive_withdate() {
        Promotion promotion = new Promotion(
                10.0, LocalDate.of(2020, 5, 1)
                , LocalDate.of(2020, 5, 30)
        );
        when(promotionsRepo.findById(anyLong())).thenReturn(Optional.of(promotion));
        assertTrue(promotionService.isPromotionActive(1l, LocalDate.of(2020, 5, 20)));
    }
}