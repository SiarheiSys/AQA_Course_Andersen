package Lesson_4;
// Задание 1. Класс Dog наследует класс Animal
public class Dog extends Animal {

    protected static int countDogs;

    public Dog(String name, int distance) {
        super(name, distance);

    }
    // Задание 3.
    @Override
    public void run () {
        if (getDistance() > 500) {
            System.out.println("Для пса " + name + " превышена максимальная дистанция по бегу для собак");
        } else if (getDistance() <= 500 && getDistance() > 0) {
            System.out.println("Пёс " + name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать дистанцию, равную нулю или отрицательному значению");
        }
    }

    @Override
    public void swim() {
        if (getDistance() > 10) {
            System.out.println("Для пса " + name + " превышена максимальная дистанция по плаванию для собак");
        } else if (getDistance() <= 10 && getDistance() > 0){
            System.out.println("Пёс " + name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не может проплыть дистанцию, равную нулю или отрицательному значению");
        }
    }

    //Задание 4.
    @Override
    public void alive(){
        countDogs++;
    }
}
