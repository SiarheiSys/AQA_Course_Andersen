package Lesson_4;

import Lesson_4.impl.Compute;

public class Triangle implements Compute {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimetr() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public double square() {
        double p = (getSide1() + getSide2() + getSide3()) / 2;
        return Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));
    }
}
