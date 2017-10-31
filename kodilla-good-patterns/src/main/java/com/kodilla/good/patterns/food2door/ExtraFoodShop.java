package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class ExtraFoodShop implements Supplier {
    HashMap<String, Integer> products = new HashMap<>();

    @Override
    public boolean process(Order order) {
        if (products.containsKey(order.getProduct()))
            return products.get(order.getProduct()) >= order.getHowMany();
        else return false;
    }

    public HashMap<String, Integer> getProducts(){
        return products;
    }
}
