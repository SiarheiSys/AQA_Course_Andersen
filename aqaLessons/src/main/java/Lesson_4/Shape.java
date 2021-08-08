package Lesson_4;

import Lesson_4.impl.Square;

public class Shape {
    private double shapeId;

    public double getShapeId() {
        return shapeId;
    }

    public void setShapeId(double shapeId) {
        this.shapeId = shapeId;
    }

    public Shape(double shapeId) {
        this.shapeId = shapeId;
    }
}
