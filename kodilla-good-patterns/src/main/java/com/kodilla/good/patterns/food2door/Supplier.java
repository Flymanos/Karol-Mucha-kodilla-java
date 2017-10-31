package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public interface Supplier {
    HashMap<String, Integer> products = new HashMap<>();

    boolean process(Order order);

    default HashMap<String, Integer> getProducts(){
        return products;
    }
}
