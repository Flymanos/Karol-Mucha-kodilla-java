package com.kodilla.stream.world;

import java.util.ArrayList;

public class Continent {
    private ArrayList<Country> countries = new ArrayList<>();

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country){
        countries.add(country);
    }
}
