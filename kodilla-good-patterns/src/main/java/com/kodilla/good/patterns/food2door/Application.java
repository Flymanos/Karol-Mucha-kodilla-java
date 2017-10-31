package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String args[]){
        Supplier supplier1 = new ExtraFoodShop();
        supplier1.getProducts().put("Ziemniaki", 10);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(new Order("Ziemniaki", 9), supplier1);
    }
}
