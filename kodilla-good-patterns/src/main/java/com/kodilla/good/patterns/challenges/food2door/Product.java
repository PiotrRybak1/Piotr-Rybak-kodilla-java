package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    String productName;
    Double productPrice;
    Producer producer;


    public Product(String productName, Double productPrice,Producer producer) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.producer = producer;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Producer getProducer() {
        return producer;
    }
}
