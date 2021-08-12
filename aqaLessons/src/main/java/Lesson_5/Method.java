package Lesson_5;

import java.util.Arrays;

// Задание 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)
// Метод выполняется в классе TwoElements

public class Method <T>{
    private T[] array;

    public Method (T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void exchange(int a, int b){
        T c = getArray()[a - 1];// предполагается, что человек, выбирающий элемент массива, не знает об особенностях
        // нумерации элементов массива
        getArray()[a - 1] = getArray()[b - 1];
        getArray()[b - 1] = c;
        System.out.println(Arrays.toString(getArray()));
    }
}
