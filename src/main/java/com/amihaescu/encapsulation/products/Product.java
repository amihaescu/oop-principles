/*
 * Copyright 2020 Dell Inc. or its subsidiaries. All Rights Reserved.
 */
package com.amihaescu.encapsulation.products;/*
 * Copyright 2020 Dell Inc. or its subsidiaries. All Rights Reserved.
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private String title;
    private Double price;
    private List<Promotion> promotions;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public Product(String title, Double price, List<Promotion> promotions) {
        this.title = title;
        this.price = price;
        this.promotions = new ArrayList<>(promotions);
    }

    public List<Promotion> getPromotions() {
        return Collections.unmodifiableList(promotions);
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = new ArrayList<>(promotions);
    }

    public void addPromotion(Promotion promotion) {
        this.promotions.add(promotion);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Promotion> getActivePromotions(LocalDate now) {
        return this.promotions.stream()
                .filter(promotion -> promotion.isActive(now))
                .collect(Collectors.toList());
    }
}