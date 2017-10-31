package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Supplier {

    @Override
    public boolean process(Order order) {
        if (products.containsKey(order.getProduct()))
            return products.get(order.getProduct()) >= order.getHowMany();
        else return false;
    }
}
