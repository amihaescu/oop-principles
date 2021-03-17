package com.amihaescu.encapsulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Product {

    private String name;
    private double price;
    private List<Promotion> promotions;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {

    }

    public String getTitle() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public List<Promotion> getPromotions() {
        return Collections.unmodifiableList(this.promotions);
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = new ArrayList<>(promotions);
    }
}
