package Lesson_4;

public class Cat1 {
    private String name;
    private int appetite;
    // Задание 5. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public Cat1(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}