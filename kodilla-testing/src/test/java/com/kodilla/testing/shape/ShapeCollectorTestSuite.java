package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 1;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("ShapeCollector Test Suite start!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("ShapeCollector Test Suite end!");
    }

    @Before
    public void before(){
        System.out.println("Test nr " + testCounter + " started!");
    }

    @After
    public void after(){
        System.out.println("Test nr " + testCounter + " ended!");
        testCounter++;
    }

    @Test
    public void testAddFigure(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(12);
        //WHEN
        shapeCollector.addFigure(circle);
        //THEN
        Assert.assertTrue(shapeCollector.getShapes().contains(circle));
    }

    @Test
    public void testRemoveFigure(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(12);
        shapeCollector.getShapes().add(square);
        //WHEN
        shapeCollector.removeFigure(square);
        //THEN
        Assert.assertFalse(shapeCollector.getShapes().contains(square));
    }

    @Test
    public void testGetFigure(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(12, 12);
        shapeCollector.getShapes().add(triangle);
        //WHEN
        Shape result = shapeCollector.getFigure(0);
        //THEN
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void testShowFigures(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        shapeCollector.getShapes().add(square);
        //WHEN
        String result = shapeCollector.showFigures();
        //THEN
        Assert.assertEquals("Square 4.0\n", result);
    }
}
