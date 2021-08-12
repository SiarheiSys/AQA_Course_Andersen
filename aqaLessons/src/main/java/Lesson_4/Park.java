package Lesson_4;
// Задание 7. Создать класс Park с внутренним классом,
// с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
public class Park {
    private Attraction attraction;

    public class Attraction {
        private String name;
        private int openTime;
        private int closeTime;
        private float price;

        public Attraction (String name, int openTime, int closeTime, float price) {
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.price = price;
        }
    }
}
