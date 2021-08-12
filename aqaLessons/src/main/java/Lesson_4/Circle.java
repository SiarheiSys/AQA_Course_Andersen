package Lesson_4;

import Lesson_4.impl.Compute;

public class Circle implements Compute {
    private final double PI = 3.14;
    private double radius;
    private String fillColor;
    private String borderColor;

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius, String fillColor, String borderColor){
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimetr() {
        return 2 * PI * getRadius();
    }

    @Override
    public double square() {
        return PI * getRadius() * getRadius();
    }
}
