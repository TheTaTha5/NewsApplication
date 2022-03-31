package com.example.newsapplication;

public class CatagoryRVModal {

    private String category;
    private String categoryImageUrl;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }

    public CatagoryRVModal(String category, String categoryImageUrl) {
        this.category = category;
        this.categoryImageUrl = categoryImageUrl;
    }
}
