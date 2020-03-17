/*
 * Copyright 2020 Dell Inc. or its subsidiaries. All Rights Reserved.
 */
package com.amihaescu.encapsulation.products;

import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class PromotionService {

    private PromotionsRepo promotionsRepo;

    public PromotionService(PromotionsRepo promotionsRepo) {
        this.promotionsRepo = promotionsRepo;
    }

    boolean isPromotionActive(Long id) {
        return isPromotionActive(id, LocalDate.now());
    }

    boolean isPromotionActive(Long id, LocalDate date) {
        Optional<Promotion> optionalPromotion = promotionsRepo.findById(id);
        if (optionalPromotion.isPresent()) {
            Promotion promotion = optionalPromotion.get();
            return promotion.getStartDate().isBefore(date) && promotion.getEndDate().isAfter(date);
        } else {
            throw new EntityNotFoundException();
        }

    }
}
