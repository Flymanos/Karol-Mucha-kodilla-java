package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void getPeoplesQuantity0PeopleTestCase(){
        //given
        World world = new World();
        world.addContinent(new Continent());
        world.addContinent(new Continent());
        world.addContinent(new Continent());
        for (Continent continent : world.getContinents()){
            continent.addCountry(new Country(new BigDecimal(0)));
        }
        //when
        BigDecimal result = world.getPeopleQuantity();
        //then
        Assert.assertEquals(new BigDecimal(0), result);
    }

    @Test
    public void getPeoplesQuantity20PeopleByCountryTestCase(){
        //given
        World world = new World();
        world.addContinent(new Continent());
        world.addContinent(new Continent());
        world.addContinent(new Continent());
        for (Continent continent : world.getContinents()){
            continent.addCountry(new Country(new BigDecimal(20)));
        }
        //when
        BigDecimal result = world.getPeopleQuantity();
        //then
        Assert.assertEquals(new BigDecimal(60), result);
    }
    
    @Test
    public void getPeoplesQuantityManyCountriesTestCase(){
        //given
        World world = new World();
        world.addContinent(new Continent());
        world.addContinent(new Continent());
        world.addContinent(new Continent());
        for (Continent continent : world.getContinents()){
            continent.addCountry(new Country(new BigDecimal(20)));
            continent.addCountry(new Country(new BigDecimal(20)));
            continent.addCountry(new Country(new BigDecimal(20)));
        }
        //when
        BigDecimal result = world.getPeopleQuantity();
        //then
        Assert.assertEquals(new BigDecimal(180), result);
    }
}
