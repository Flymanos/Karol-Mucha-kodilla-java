package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void buildBigmacTest(){
        //given
        Bigmac bigmac;
        //when
        bigmac = new Bigmac.BigmacBuilder()
                .burgers(3)
                .sauce(SauceFactory.makeSauce(SauceFactory.SAUCE1000ISLANDS))
                .roll(RollFactory.makeRoll(RollFactory.WITHSEZAM))
                .ingredients(IngredientFactory.makeIngredient(IngredientFactory.SALAD))
                .build();
        //then
        Assert.assertEquals(SauceFactory.SAUCE1000ISLANDS, bigmac.getSauce().getFlavour());
    }

    @Test
    public void failedBuildBigmacTest(){
        //given
        Bigmac bigmac;
        String message = "";
        //when
        try {
            bigmac = new Bigmac.BigmacBuilder()
                    .burgers(3)
                    .sauce(SauceFactory.makeSauce("funky sauce"))
                    .roll(RollFactory.makeRoll(RollFactory.WITHSEZAM))
                    .ingredients(IngredientFactory.makeIngredient(IngredientFactory.SALAD))
                    .build();
        } catch (IllegalStateException e){
            message = e.getMessage();
        }
        //then
        Assert.assertEquals("There is no such sauce.", message);
    }
}
