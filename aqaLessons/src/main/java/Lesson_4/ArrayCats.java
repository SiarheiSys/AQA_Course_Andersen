package Lesson_4;

public class ArrayCats {
    public static void main(String[] args) {
        // Задание 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
        // и потом вывести информацию о сытости котов в консоль.
        Cat1[] cats = new Cat1[5];
        cats[0] = new Cat1("Barsik", 20, false);
        cats[1] = new Cat1("Murzik", 5, false);
        cats[2] = new Cat1("Shurik", 10, false);
        cats[3] = new Cat1("Chernysh", 15, false);
        cats[4] = new Cat1("Belyj", 21, false);
        Plate plate1 = new Plate(50);
        for(Cat1 i : cats) {
            if(plate1.getFood() - i.getAppetite() >= 0 ) {
            i.eat(plate1);
            i.setSatiety(true);
            }
        }
        for(Cat1 i : cats) {
            System.out.println(i.getName() + " имеет сытость " + i.isSatiety());
        }

    }
}
