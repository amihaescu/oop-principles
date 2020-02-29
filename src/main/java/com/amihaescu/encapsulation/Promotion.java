package com.amihaescu.encapsulation;

import java.time.LocalDate;

public class Promotion {

    private Double discount;
    private LocalDate startDate;
    private LocalDate endDate;

    public Promotion() {
    }

    public Promotion(Double discount, LocalDate startDate, LocalDate endDate) {
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isActive(LocalDate currentDate) {
        return startDate.isBefore(currentDate) && endDate.isAfter(currentDate);
    }

    public boolean isActive(){
        return isActive(LocalDate.now());
    }
}
