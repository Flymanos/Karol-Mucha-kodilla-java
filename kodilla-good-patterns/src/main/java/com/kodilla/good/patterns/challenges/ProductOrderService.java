package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InfoModule infoModule;
    private ShopModule shopModule;
    private RealisationModule realisationModule;

    public ProductOrderService(InfoModule infoModule, ShopModule shopModule, RealisationModule realisationModule) {
        this.infoModule = infoModule;
        this.shopModule = shopModule;
        this.realisationModule = realisationModule;
    }

    public void buySomething(User user, Product product){
        Order order = new Order(product, user);
        if (shopModule.processOrder(order)){
            infoModule.infoUser(true, order);
            realisationModule.addOrderToDeque(order);
        } else infoModule.infoUser(false, order);
    }
}
