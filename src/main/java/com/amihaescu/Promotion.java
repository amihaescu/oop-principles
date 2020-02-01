package com.amihaescu;

import java.time.LocalDate;

public class Promotion {

    Double discount;
    LocalDate startDate;
    LocalDate endDate;

    public Promotion() {
    }

    public Promotion(Double discount, LocalDate startDate, LocalDate endDate) {
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Double getDiscount() {
        return discount;
    }

    public boolean isActive(LocalDate date) {
        return startDate.isBefore(date) && endDate.isAfter(date);
    }

    public boolean isActive() {
        return isActive(LocalDate.now());
    }

}
