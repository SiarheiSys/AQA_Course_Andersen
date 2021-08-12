package Lesson_5;

public class TwoElements {
    public static void main(String[] args) {
        Method<String> capitals = new Method<>("London", "Moscow", "Kyiv", "Minsk", "Warsaw");
        capitals.exchange(3, 5);
    }
}
