package Lesson_4;

public class MainAnimal {
    public static void main(String[] args) {
        Cat vasya = new Cat("Вася", 50);
        vasya.alive();
        Cat murzik = new Cat("Мурзик", 500);
        murzik.alive();
        Dog bobik = new Dog("Бобик", 100);
        bobik.alive();
        Dog barbos = new Dog("Барбос", 1000);
        barbos.alive();
        Dog sharik = new Dog("Шарик", 5);
        sharik.alive();
        Dog pit = new Dog("Пит", -1);
        pit.alive();
        Animal animal = new Animal("Чупакабра", 650);
        animal.alive();
        vasya.run();
        murzik.run();
        vasya.swim();
        murzik.swim();
        bobik.run();
        barbos.run();
        bobik.swim();
        barbos.swim();
        sharik.swim();
        pit.swim();
        animal.run();
        animal.swim();
        System.out.println(Animal.countAnimals);
        System.out.println(Cat.countCats);
        System.out.println(Dog.countDogs);

    }
}
