package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
    ArrayList<Shape> figureCollection = new ArrayList<>();


    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {

        figureCollection.add(this.shape);

    }

    public void removeFigure(Shape shape) {

        figureCollection.add(this.shape);
        boolean result = figureCollection.remove(this.shape);
    }

    public Shape getFigure(int n) {
        return null;
    }

    public void showFigures() {

    }
}
