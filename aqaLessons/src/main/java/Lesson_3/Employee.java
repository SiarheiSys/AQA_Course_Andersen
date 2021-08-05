package Lesson_3;
// Задание 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;// Тип String, чтобы вводить номер в формате "+ (код страны)(код города или сети)(номер)"
    private double salary;// Зарплата может быть и с копейками
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <=0) {
            System.out.println("Неверное значение возраста");
        } else {
            this.age = age;
        }
    }

// Задание 2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee (String name, String position, String email, String phoneNumber, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

// Задание 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void printEmployee() {
        System.out.println("Имя сотрудника: " + name + "; Должность сотрудника: " + position + "; Адрес электронной почты сотрудника: " + email +
                "; Номер телефона сотрудника: " + phoneNumber + "; Заработная плата сотрудника: " + salary + "; Возраст сотрудника: " + age);
    }

// Задание 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    /* public void employeesMoreThan40() {
        for (Employee i : MainApp.arrayEmployees) {
            if (getAge() > 40) {
                printEmployee();
            }
        }
    }*/
}

