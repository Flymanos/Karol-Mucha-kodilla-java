package com.kodilla.good.patterns.food2door;

public class Order {
    private String product;
    private int howMany;

    public Order(String product, int howMany) {
        this.product = product;
        this.howMany = howMany;
    }

    public String getProduct() {
        return product;
    }

    public int getHowMany() {
        return howMany;
    }
}
