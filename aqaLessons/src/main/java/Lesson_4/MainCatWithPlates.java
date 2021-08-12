package Lesson_4;

public class MainCatWithPlates {
    public static void main(String[] args) {
        Cat1 cat = new Cat1("Barsik", 5, false);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
