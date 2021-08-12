package Lesson_4;

public class Figures {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0, "Зелёный", "Жёлтый");
        Rectangle rectangle = new Rectangle(24.0, 17.3, "Красный", "Синий");
        Triangle triangle = new Triangle(10.2, 8.0, 9.6, "Оранжевый", "Коричневый");
        System.out.println("Окружность имеет периметр " + circle.perimetr() + " см, площадь " + circle.square() + " см2, цвет фона "
        + circle.getFillColor() + " и цвет границы " + circle.getBorderColor());
        System.out.println("Прямоугольник имеет периметр " + rectangle.perimetr() + " см, площадь " + rectangle.square() + " см2, цвет фона "
                + rectangle.getFillColor() + " и цвет границы " + rectangle.getBorderColor());
        System.out.println("Треугольник имеет периметр " + triangle.perimetr() + " см, площадь " + triangle.square() + " см2, цвет фона "
                + triangle.getFillColor() + " и цвет границы " + triangle.getBorderColor());
    }
}
