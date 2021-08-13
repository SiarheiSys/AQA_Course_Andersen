package Lesson_5;


import java.util.ArrayList;
import java.util.Arrays;

public class FruitsInBox {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>();
        appleBox.inBox(apple, 5);
        Orange orange = new Orange();
        Box<Orange> orangeBox = new Box<>();
        orangeBox.inBox(orange, 6);
        System.out.println("Масса коробки №1 с яблоками: " + appleBox.getWeight());
        System.out.println("Масса коробки №1 с апельсинами: " + orangeBox.getWeight());
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        appleBox1.inBox(apple, 7);
        orangeBox1.inBox(orange, 45);
        System.out.println("Масса коробки №2 с яблоками: " + appleBox1.getWeight());
        System.out.println("Масса коробки №2 с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Результат сравнения коробки с яблоками №1 и №2: " + appleBox.compare(appleBox1));
        System.out.println("Результат сравнения коробки с апельсинами №1 и №2: " + orangeBox.compare(orangeBox1));
        // Задача 2.6
        appleBox.pour(appleBox1); //приведение к ArrayList не срабатывает
        System.out.println(appleBox); // Arrays.toString(appleBox) не срабатывает. Выводится что-то не то
        System.out.println(appleBox1);// Arrays.toString(appleBox1) не срабатывает. Выводится что-то не то


    }
}
