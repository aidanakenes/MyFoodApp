package com.example.myfoodapp.models;

public class DetailedDailyModel {


    int image;
    String name;
    String description;
    String rating;
    String price;
    String timing;

    public DetailedDailyModel(int image, String name, String description, String rating, String price, String timing) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.price = price;
        this.timing = timing;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    public String getTiming() {
        return timing;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}