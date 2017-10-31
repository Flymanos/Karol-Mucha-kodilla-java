package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    public void processOrder(Order order, Supplier supplier){
        if(supplier.process(order)) System.out.println("Order completed successfully!");
        else System.out.println("Order failed");
    }
}
