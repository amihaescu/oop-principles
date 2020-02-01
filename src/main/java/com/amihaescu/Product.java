package com.amihaescu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private String title;
    private Double price;
    private List<Promotion> promotionList;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
        this.promotionList = new ArrayList<>();
    }

    public Product(String title, Double price, List<Promotion> promotionList) {
        this.title = title;
        this.price = price;
        this.promotionList = new ArrayList<>(promotionList);
    }

    public List<Promotion> getPromotionList() {
        return Collections.unmodifiableList(promotionList);
    }

    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = new ArrayList<>(promotionList);
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

    public List<Promotion> getActivePromotions(LocalDate currentDate) {
        return promotionList.stream()
                .filter(promotion -> promotion.isActive(currentDate))
                .collect(Collectors.toList());
    }
}
