package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class World {
    private ArrayList<Continent> continents = new ArrayList<>();

    public ArrayList<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
