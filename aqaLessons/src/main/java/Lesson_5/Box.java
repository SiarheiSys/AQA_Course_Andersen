package Lesson_5;

import java.util.ArrayList;


// Задача 2.2. Класс Box, в который можно складывать фрукты.
// Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины
public class Box <T extends Fruit> {
    // Задача 2.3. Для хранения фруктов внутри коробки можно использовать ArrayList
    private ArrayList<T> box = new ArrayList<>();
    private float weight;

    public ArrayList<T> getBox() {
        return box;
    }

    // Задача 2.7. Не забываем про метод добавления фрукта в коробку
    public void inBox(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            getBox().add(fruit);
        }
    }

    // Задача 2.4. Сделать метод getWeight(), который высчитывает вес коробки,
    // зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны)
    public float getWeight() {
        for(T fruit : getBox()) {
            weight += fruit.getWeightFruit();
        }
        return weight;
    }

    // Задача 2.5. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
    // которую подадут в compare() в качестве параметра.
    // true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами
    public boolean compare(Box <T> box1) {
        return getWeight() == box1.getWeight();
    }

    // Задача 2.6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    // Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    // Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой

    public void pour(ArrayList <T> box1) {
        box1.addAll(getBox());
        getBox().clear();
    }
}
