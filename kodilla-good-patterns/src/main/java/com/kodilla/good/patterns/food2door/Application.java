package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String args[]){
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.getProducts().put("Ziemniaki", 10);
        extraFoodShop.getProducts().put("Pietruszka", 20);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(new Order("Ziemniaki", 9), extraFoodShop);
        orderProcessor.processOrder(new Order("Pietruszka", 5), extraFoodShop);
    }
}
