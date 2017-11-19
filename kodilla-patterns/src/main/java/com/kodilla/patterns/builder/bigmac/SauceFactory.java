package com.kodilla.patterns.builder.bigmac;

public class SauceFactory {
    public static final String SAUCE1000ISLANDS = "SAUCE1000ISLANDS";
    public static final String SAUCESTANDARD = "SAUCESTANDARD";
    public static final String SAUCEBARBECUE = "SAUCEBARBECUE";

    public static Sauce makeSauce(final String flavour){
        if (flavour == SAUCE1000ISLANDS || flavour == SAUCESTANDARD || flavour == SAUCEBARBECUE){
            return new Sauce(flavour);
        } else {
            throw new IllegalStateException("There is no such sauce.");
        }
    }
}
