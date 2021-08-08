package Lesson_4;
// Задание 1. Класс Cat наследует класс Animal
public class Cat extends Animal {

    protected static int countCats;

    public Cat (String name, int distance) {
        super(name, distance);

    }
    // Задание 3.
    @Override
    public void run () {
        if (getDistance() > 200) {
            System.out.println("Для кота " + name + " превышена максимальная дистанция по бегу для котов");
        } else if (getDistance() <= 200 && getDistance() > 0){ /*
            Хотя конструктор и проверят, чтобы дистанция не была отрицательной или равна нулю, тем не менее,
            при вызове метода со значением, равным нулю или отрицательному числу, выводится строка, например,
            "Кот Снежок пробежал 0 метров". Такое поведение не совсем корректно. Не до конца понимаю, почему при значении
            равном нулю или отрицательному числу, всегда показывает "0 метров". Могу лишь предположить, что так как при проверке в
            конструкторе значение переменной distance не задаётся, то считается, что оно равно 0.
            */
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать дистанцию, равную нулю или отрицательному значению");
        }
    }

    @Override
    public void swim() {
        System.out.println(name + " не умеет плавать, так как он кот");
    }

    //Задание 4.
    @Override
    public void alive(){
        countCats++;
    }
}
