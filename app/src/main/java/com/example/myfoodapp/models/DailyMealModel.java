package com.example.myfoodapp.models;

public class DailyMealModel {

    int image;
    String name;
    String discount;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String descriptions;

    public DailyMealModel(int image, String name, String discount, String type, String descriptions) {
        this.image = image;
        this.name = name;
        this.discount = discount;
        this.descriptions = descriptions;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDiscount() {
        return discount;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
