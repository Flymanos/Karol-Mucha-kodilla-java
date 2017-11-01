package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String args[]){
        ProductOrderService productOrderService = new ProductOrderService(new ClassicInfoService(),
                new ClassicShopModule(),
                new ClassicRealisationModule());

        productOrderService.buySomething(new User("Grzegorz", "grzegorz@brzcz.pl"), new Car("Porsche", 1410));
    }
}
