/*
 * Copyright 2020 Dell Inc. or its subsidiaries. All Rights Reserved.
 */
package com.amihaescu.encapsulation.products;/*
 * Copyright 2020 Dell Inc. or its subsidiaries. All Rights Reserved.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Promotion {

    @Id
    @GeneratedValue
    private Long id;
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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isActive(LocalDate date) {
        return this.startDate.isBefore(date) && this.endDate.isAfter(date);
    }

    public boolean isActive() {
        return this.isActive(LocalDate.now());
    }
}