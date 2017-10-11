package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public String showFigures(){
        String figures = "";
        for (Shape shape : shapes){
            figures += shape.getShapeName() + " " + shape.getField() + "\n";
        }
        return figures;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
