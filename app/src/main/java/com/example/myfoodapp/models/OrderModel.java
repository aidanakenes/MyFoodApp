package com.example.myfoodapp.models;


public class OrderModel {
    String product;
    String price;
    String count;

    public OrderModel(String product, String price, String count) {
        this.product = product;
        this.price = price;
        this.count = count;
    }

    public String getProduct() {
        return product;
    }

    public String getPrice() {
        return price;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

}
