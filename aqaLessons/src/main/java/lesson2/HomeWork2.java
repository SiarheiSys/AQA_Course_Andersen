package lesson2;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(twoIntegerNumbers(2, 11));
        System.out.println(twoIntegerNumbers(1, 3));
        System.out.println(twoIntegerNumbers(52, 5));
        positiveOrNegative(-1);
        positiveOrNegative(0);
        positiveOrNegative(1);
        System.out.println(negativeIsTruePositiveIsFalse(-1));
        System.out.println(negativeIsTruePositiveIsFalse(0));
        System.out.println(negativeIsTruePositiveIsFalse(1));
        printString("Automated testing", 5);

        // Задание №6
        int[] binary = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < binary.length; i++) {
            binary[i] = (binary[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(binary));

        // Задание №7
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
        System.out.println(Arrays.toString(hundred));

        // Задание №8
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numbers));

        // Задание №9
        int[][] massive = new int [10][10];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if ((i == j) || (i + j == 9)) {
                    massive[i][j] = 1;
                }
                System.out.print(massive[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(onedemensionalMassive(10, 6)));

        System.out.println(leapYear(2000));
        /* 2000 - високосный, так как делится на 100, то нужно проверить, чтобы делился на 400.
        На 400 делится.
         */
        System.out.println(leapYear(2004));
        // 2004 - високосный, так как делится на 4.
        System.out.println(leapYear(1901));
        // 1901 - невисокосный
        System.out.println(leapYear(200));
        /* 200 - невисокосный. Так как делится на 100, то нужно проверить, чтобы делился на 400.
        На 400 не делится.
         */
        System.out.println(leapYear(1900));
        /* 1900 - невисокосный. Так как делится на 100, то нужно проверить, чтобы делился на 400.
        На 400 не делится.
         */

        // Задание * (между 10 и 11 заданиями)
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 0};
        int max = mass[0];
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (max <= mass[i]) {
                max = mass[i];
            }
            if (min >= mass[i]) {
                min = mass[i];
            }
        }
        System.out.println("max = " + max + ", min = " + min);

        int[] firstMass = {3, 2, 1, 7, -1};
        int[] secondMass = {1, 2, 3, 4};
        System.out.println(matchingParts(firstMass));
        System.out.println(matchingParts(secondMass));
        rearrangement(secondMass, 2);
        rearrangement(firstMass, 3); // работает некорректно. Сдвиг есть, элементы массива пропадают или изменяются.
    }

    // Задание №1
    public static boolean twoIntegerNumbers(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    // Задание №2
    public static void positiveOrNegative(int a){
        System.out.println((a >= 0) ? ("Число положительное") : ("Число отрицательное"));
    }

    //Задание №3
    public static boolean negativeIsTruePositiveIsFalse(int a) {
        return a < 0;
    }

    // Задание №4
    public static void printString(String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    //Задание №10
    public static int[] onedemensionalMassive(int len, int initialValue) {
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
        }
        return a;
    }

    //Задание * (между заданием 4 и заданием 6)
    public static boolean leapYear(int year) {
        if ((year % 100 == 0) && (year % 400 != 0)) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задание ** (между заданием 10 и заданием 11)
    public static boolean matchingParts(int[] mass) {
        int sum = 0;
        for (int i : mass) {
            sum += i;
        }
        int sumRight = 0;
        for (int i : mass) {
            sumRight += i;
            if (sumRight == sum - sumRight) {
                return true;
            }
        }
        return false;
    }

    // Задание *** (самое последнее)
    public static void rearrangement(int[] mass, int n){
        int[] mass1 = new int[mass.length];
        for (int i = (mass.length - 1); i >= 0; i--) { // сдвиг вправо
            if (i - n >= 0) {
                mass1[i] = mass[i - n];
                } else if (i - n < 0 && i + n < mass.length) {
                mass1[i] = mass[i + n];
                }
        }
        System.out.println(Arrays.toString(mass1));
    }
}
