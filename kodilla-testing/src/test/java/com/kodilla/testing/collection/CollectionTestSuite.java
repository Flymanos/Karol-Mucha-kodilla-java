package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Collection Test Suite starting!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Collection Test Suite ending!");
    }

    @Before
    public void before(){
        System.out.println("Collection test case starting!");
    }

    @After
    public void after(){
        System.out.println("Collection test case ending!");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //GIVEN
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> test = new ArrayList<>();
        //WHEN
        ArrayList<Integer> result = exterminator.exterminate(test);
        //THEN
        Assert.assertEquals(test, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //GIVEN
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(12);
        //WHEN
        ArrayList<Integer> result = exterminator.exterminate(test);
        //THEN
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(12);
        Assert.assertEquals(expected, result);
    }
}
