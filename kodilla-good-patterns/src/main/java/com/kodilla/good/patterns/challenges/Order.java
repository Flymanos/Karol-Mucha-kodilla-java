package com.kodilla.good.patterns.challenges;

public class Order {
    private final Product product;
    private final User user;

    public Order(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}
