package com.amihaescu.encapsulation;

import java.time.LocalDate;

public class Promotion {
    private double discount;
    private LocalDate startDate;
    private LocalDate endDate;

    public Promotion() {
    }

    public Promotion(double discount, LocalDate startDate, LocalDate endDate) {
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isActive() {
        var currentDate = LocalDate.now();
        return startDate.isBefore(currentDate) && currentDate.isBefore(endDate);
    }

    public boolean isActive(LocalDate now) {
        return startDate.isBefore(now) && now.isBefore(endDate);
    }
}
