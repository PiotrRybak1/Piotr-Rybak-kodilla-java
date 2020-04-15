package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    String name;
    Double sideLength;

    public Square(String name, Double sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }


    public String getShapeName() {
        return name;
    }


    public Double getField() {
        return sideLength * sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return name.equals(square.name) &&
                sideLength.equals(square.sideLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sideLength);
    }
}
