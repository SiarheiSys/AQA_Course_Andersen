package Lesson_4;

public class Animal {
    protected int distance; // Предположим, что любая длина препятствия выражается целым числом
    protected String name;
    protected static int countAnimals; // Выдавало ошибку, что переменная не static. Я так понял, потому что метод main статический,
    // а я пытался в нём вызвать нестатическую переменную в System.out.println

    public int getDistance() {
        return distance;
    }

    public Animal (String name, int distance) {
        this.name = name;
        if (distance <= 0) {
            System.out.println("Дистанция для " + name + " отрицательна или равна нулю. Дистанция не может быть равна 0 или быть отрицательной");
        } else {
            this.distance = distance;
        }
    }
    // Задание 2.
    public void run (){
        System.out.println(name + " пробежал " + distance + " метров");
    }

    public void swim (){
        System.out.println(name + " проплыл " + distance + " метров");
    }

    //Задание 4.
    public void alive(){
        countAnimals++;
    }
}
