package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class GlutenFreeShop implements Supplier{
    private HashMap<String, Integer> products = new HashMap<>();
    private static final int ONE_DELIVERY_QUANTITY_MIN = 5;
    private static final int ONE_DELIVERY_QUANTITY_MAX = 20;

    @Override
    public boolean process(Order order) {
        if (products.containsKey(order.getProduct()))
            return products.get(order.getProduct()) >= order.getHowMany() && ONE_DELIVERY_QUANTITY_MIN <= order.getHowMany()
                    && ONE_DELIVERY_QUANTITY_MAX >= order.getHowMany();
        else return false;
    }

    public HashMap<String, Integer> getProducts(){
        return products;
    }
}