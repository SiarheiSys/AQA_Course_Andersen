package Lesson_4;

import Lesson_4.impl.Square;

public class Circle extends Shape implements Square {
    double final PI = 3.14;
    Shape radius = new Shape(10.00);


    @Override
    double Perimetr() {
        double perimetr;
        perimetr = 2 * PI * getShapeId();
        return perimetr;
    }

    @Override
    double Square(){
        double square;
        square = PI * getShapeId() * getShapeId();
        return square;
    }
}
