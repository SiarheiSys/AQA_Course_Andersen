package Lesson_6;

public class WorkingArray {
    String[][] array;

    public WorkingArray(String[][] array){
        this.array = array;
    }

    public String[][] getArray() {
        return array;
    }

    public void arrayWork() throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (getArray().length != 4) {
            throw new MyArraySizeException("Массив не является массивом размера 4 * 4");
        }
        for (int i = 0; i < 4; i++) {
            if (getArray()[i].length != 4) {
                throw new MyArraySizeException("Массив не является массивом размера 4 * 4");
            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(getArray()[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент массива с индексом [" + i + "][" + j + "] не является числом");
                }
            }
        }
        System.out.println("Результат вычисления: " + sum);
    }
}

