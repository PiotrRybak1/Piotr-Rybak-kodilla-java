package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figureCollection = new ArrayList<>();


    public void addFigure(Shape shape) {

        figureCollection.add(shape);

    }

    public void removeFigure(Shape shape) {

        figureCollection.add(shape);
        boolean result = figureCollection.remove(shape);
    }

    public Shape getFigure(int n) {
        return figureCollection.get(n);
    }

    public void showFigures() {

    }
}
