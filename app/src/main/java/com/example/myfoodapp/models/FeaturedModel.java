package com.example.myfoodapp.models;

public class FeaturedModel {
    int image;
    String name;
    String desc;

    public FeaturedModel(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
