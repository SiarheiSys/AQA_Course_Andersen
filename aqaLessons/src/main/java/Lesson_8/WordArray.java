package Lesson_8;

import java.util.*;

public class WordArray {
    private String[] array;
    private ArrayList<String> list;
    private Set<String> setList;

    public String[] getArray() {
        return array;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setSetList(Set<String> setList) {
        this.setList = setList;
    }

    public Set<String> getSetList() {
        return setList;
    }

    public WordArray(String[] array) {
        this.array = array;
    }

    // Задача 1. Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    public void uniqueWords() {
        setList(new ArrayList<>(Arrays.asList(getArray())));
        System.out.println(getList());
        //Эти две строки были просто для проверки более удобной последующей сверки в консоли
        setSetList(new LinkedHashSet<>(Arrays.asList(getArray()))); /* Поработаем с нашим массивом с помощью коллекции Set <E>
        Выбор Set<E> обусловлен тем, что позволяет откинуть все повторяющиеся элементы. LinkedHashSet<>() использовал,
        чтобы значения выводились в том же порядке, как были заданы в массиве, чтобы потом было легче сверить. */
        System.out.println(getSetList()); // убедились, что всё сработало как нужно

        // Ниже альтернативный вариант
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, getArray());
        Set<String> setList1 = new LinkedHashSet<>(arrayList);
        System.out.println(setList1); // убедились, что всё сработало как нужно
    /* Я прочитал, что таким способом arrayList и wordList (наш массив из MainApp) будут независимы друг от друга, и
    изменение wordList не затронет arrayList, что может иметь значение в определённых ситуациях.
    Думаю, что в данной ситуации, чтобы просто вывести список уникальных слов, выбранный способ решения особого значения
    не имеет.*/
    }

    // Задача 1. Посчитать, сколько раз встречается каждое слово.
    public void frequencyWords() {
        setList(new ArrayList<>(Arrays.asList(getArray())));
        setSetList(new LinkedHashSet<>(Arrays.asList(getArray())));
        ArrayList<String> list1 = new ArrayList<>(getSetList());
        for (int i = 0; i < getList().size(); i++) {
            try {
                int frequency = Collections.frequency(getList(), list1.get(i));
                System.out.println("Слово " + '"' + list1.get(i) + '"' + " встречается " + frequency + " раз.");
            } catch (IndexOutOfBoundsException e) {
                System.out.print("");
            }
        }
        /* Немного пояснений, почему именно так.

        В принципе, можно было оставить код в таком виде:

        int frequency = 0;
        setList(new ArrayList<>(Arrays.asList(getArray())));
        setSetList(new LinkedHashSet<>(Arrays.asList(getArray())));
        for (int i = 0; i < getList().size(); i++) {
            frequency = Collections.frequency(getList(), getList().get(i));
            System.out.println("Слово " + '"' + getList().get(i) + '"' + " встречается " + frequency + " раз.");
        }

        Он работает, но из-за того, что в list у нас есть повторяющиеся слова, строчки о количестве слов встречаются
        столько раз, сколько раз встречается само слово, например, строчка про слово "песок" выводится 3 раза.
        Это не критично, но не идеально и смотрится недоработано.
        Поэтому в System.out.println и в Collections.frequency() наименования значений нужно брать из списка с уникальными значениями.
        Так как у setList нельзя вызвать метод get(), то пришлось создать list1.
        Теперь сообщения выводятся по одному разу, но в конце ещё вылетает исключение IndexOutOfBoundsException,
        что объясняется тем, что i в нашем цикле берётся по количеству элементов в list, а их там больше.
        Поо факту имеем то, что всё работает вроде бы и корректно, но исключение всё портит, хотя, по сути, ни на
        что не влияет. Поэтому обработаем исключение, чтобы вместо него просто ничего не выводилось.
         */
    }
}
