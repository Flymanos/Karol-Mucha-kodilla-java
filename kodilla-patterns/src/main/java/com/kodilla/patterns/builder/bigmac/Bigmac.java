package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {



    private Roll roll;
    private int burgers;
    private Sauce sauce;
    private List<Ingredient> ingredients;

    private Bigmac(Roll roll, int burgers, Sauce sauce, List<Ingredient> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder{
        private Roll roll;
        private int burgers;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder roll(Roll roll){
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(Ingredient ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            try{
                return new Bigmac(roll, burgers, sauce, ingredients);
            } catch (IllegalStateException e){
                System.out.println(e);
            }
            return null;
        }
    }

    public Roll getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
