package Lesson_8;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap <String, String> book = new HashMap<>(); // здесь будут храниться телефоны и фамилии

    public HashMap<String, String> getBook() {
        return book;
    }

    public void add(String number, String surname) {
        getBook().put(number, surname);
        /* Добавляем в качестве ключа номер телефона, а в качестве значения - фамилию. Это связано с тем,
        что значение ключа всегда уникально. Если в качестве ключа задать фамилию, то при добавлении новой
        записи в случае совпадения фамилии номер телефона, записанный ранее в качестве значения для такой же фамилии будет утерян.
        По условию же, нам нужно, чтобы мы могли по фамилии найти номер телефона и номеров телефона может быть несколько вместе
        с одной и той же фамилией, так как могут однофамильцы. Это означает, что в качестве ключа нужно задавать именно номер,
        который, в отличие от фамилии, будет всегда уникальным.*/
    }

    public void get(String surname) {
        if(book.containsValue(surname)){
            for(Map.Entry<String, String> p : getBook().entrySet()) {
                if (p.getValue().equals(surname)) {
                    System.out.println(
                            "Вы ввели фамилию " + surname + ". По указанной фамилии найден номер телефона: "
                                    + p.getKey());
                }
            }
        } else {
            System.out.println("Указанной фамилии в справочнике нет");
        }
    }
}