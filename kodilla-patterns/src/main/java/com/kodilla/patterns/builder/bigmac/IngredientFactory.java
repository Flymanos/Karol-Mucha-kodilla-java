package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IngredientFactory {
    public static final String SALAD = "SALAD";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILI = "CHILI";
    public static final String CHEESE = "CHEESE";

    public static final List<String> whitelist = new ArrayList<>(Arrays.asList(SALAD, ONION, BACON, CUCUMBER, CHILI, CHEESE));

    public static Ingredient makeIngredient(final String name){
        if (whitelist.contains(name)){
            return new Ingredient(name);
        } else{
            throw new IllegalStateException("There is no such ingredient available.");
        }
    }
}
