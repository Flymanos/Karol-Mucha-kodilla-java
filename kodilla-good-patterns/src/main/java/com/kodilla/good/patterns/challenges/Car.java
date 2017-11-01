package com.kodilla.good.patterns.challenges;

public class Car implements Product {
    private String name;
    private double cost;

    public Car(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

