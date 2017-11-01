package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class ClassicShopModule implements ShopModule{
    @Override
    public boolean processOrder(Order order) {
        Random random = new Random();
        return random.nextBoolean(); // XD
    }
}
