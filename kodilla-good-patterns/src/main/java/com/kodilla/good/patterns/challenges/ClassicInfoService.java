package com.kodilla.good.patterns.challenges;

public class ClassicInfoService implements InfoModule{
    @Override
    public void infoUser(boolean isSold, Order order) {
        System.out.println("Mail sent on " + order.getUser().getEmail());
        System.out.println("Dear " + order.getUser().getNickname());
        System.out.println("Your order: \nName: " + order.getProduct().getName());
        System.out.println("Cost: " + order.getProduct().getCost());
        if(isSold) System.out.println("Will be send to you immediately!");
        else System.out.println("Have failed...");
    }
}
