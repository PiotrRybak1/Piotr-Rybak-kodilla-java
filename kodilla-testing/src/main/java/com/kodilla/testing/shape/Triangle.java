package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    String name;
    Double basis;
    Double height;

    public Triangle(String name, Double basis, Double height) {
        this.name = name;
        this.basis = basis;
        this.height = height;
    }

    public String getShapeName() {
        return name;
    }


    public Double getField() {
        return 0.5 * basis * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return name.equals(triangle.name) &&
                basis.equals(triangle.basis) &&
                height.equals(triangle.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, basis, height);
    }
}
