package Lesson_3;

public class MainApp {
    public static void main(String[] args) {
        // Задание 4. Создать массив из 5 сотрудников.
        Employee[] arrayEmployees = new Employee[5];
        arrayEmployees[0] = new Employee("Иванов Иван Иванович", "Директор", "ivanov@aqa.com", "+3750012345678", 5000.00, 41);
        arrayEmployees[1] = new Employee("Сидоров Сидор Сидорович", "Главный бухгалтер", "sidorov@aqa.com", "+3750087654321", 3500.00, 39);
        arrayEmployees[2] = new Employee("Петров Пётр Петрович", "Юрисконсульт", "petrov@aqa.com", "+3750096857412", 2000.00, 34);
        arrayEmployees[3] = new Employee("Ковалёв Сергей Брониславович", "Экономист", "kovalyov@aqa.com", "+3750032145698", 1400.00, 48);
        arrayEmployees[4] = new Employee("Трибутько Галина Васильевна", "Уборщица", "tributko@aqa.com", "+3750096321458", 700.00, 21);

        // Задание 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        /* Альтернативный цикл
        for (int i = 0; i < 5; i++) {
            if (arrayEmployees[i].getAge() > 40) {
                arrayEmployees[i].printEmployee();
            }
        }
        */
        for (Employee i : arrayEmployees) {
            if (i.getAge() > 40) {
                i.printEmployee();
            }
        }
    }
}
