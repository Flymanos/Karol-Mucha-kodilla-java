package com.kodilla.good.patterns.challenges;

import java.util.ArrayDeque;

public class ClassicRealisationModule implements RealisationModule{
    private ArrayDeque<Order> ordersToSend = new ArrayDeque<>();

    @Override
    public void addOrderToDeque(Order order) {
        ordersToSend.add(order);
        System.out.println("Order added to send!");
    }
}
