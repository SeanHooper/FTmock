package com.zendo.zzz.objects;

/**
 * Created by Sean on 03/05/2016.
 */
public class Ad {
    private int adId;
    private String userName;
    private String topCategory;
    private String subCategory;
    private Double price;
    private String description;

    public Ad(int adId, String userName, String topCategory, String subCategory, Double price, String description) {
        this.adId = adId;
        this.userName = userName;
        this.topCategory = topCategory;
        this.subCategory = subCategory;
        this.price = price;
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public String getTopCategory() {
        return topCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
