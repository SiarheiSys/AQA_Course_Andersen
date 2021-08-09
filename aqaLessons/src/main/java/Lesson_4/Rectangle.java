package Lesson_4;

import Lesson_4.impl.Compute;

public class Rectangle implements Compute {
    private double side1;
    private double side2;
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

    public Rectangle(double side1, double side2, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimetr() {
        return 2 * (getSide1() + getSide2());
    }

    @Override
    public double square() {
        return getSide1() * getSide2();
    }
}
