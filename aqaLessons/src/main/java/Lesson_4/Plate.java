package Lesson_4;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
        // Задание 5.
        // Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
        // (например, в миске 10 еды, а кот пытается покушать 15-20).
        if(food < 0) {
            System.out.println("В тарелке нет столько еды, сколько кот хочет съесть");
            food += n;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    // Задание 5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void increaseFood(int a) {
        food += a;
    }
}