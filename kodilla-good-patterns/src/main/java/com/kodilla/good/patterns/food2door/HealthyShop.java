package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class HealthyShop implements Supplier {
    HashMap<String, Integer> products = new HashMap<>();
    private static final int ONE_DELIVERY_QUANTITY = 10;

    @Override
    public boolean process(Order order) {
        if (products.containsKey(order.getProduct()))
            return products.get(order.getProduct()) >= order.getHowMany() && ONE_DELIVERY_QUANTITY <= order.getHowMany();
        else return false;
    }

    public HashMap<String, Integer> getProducts(){
        return products;
    }
}