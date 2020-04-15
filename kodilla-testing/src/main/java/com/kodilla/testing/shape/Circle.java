package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    String name;
    Double radius;


    public Circle(String name, Double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getShapeName() {
        return name;

    }

    public Double getField() {
        return 3.14 * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return name.equals(circle.name) &&
                radius.equals(circle.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }
}


