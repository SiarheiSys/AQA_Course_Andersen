package Lesson_6;

public class MainArray {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] correct = {{"1", "2", "3", "4"},
                                {"5", "6", "7", "8"},
                                {"9", "10", "11", "12"},
                                {"13", "14", "15", "16"}};
        String[][] incorrect = {{"1", "2", "3", "4"},
                                {"5", "6", "7", "8"},
                                {"9", "10", "11", "12"},
                                {"13", "14", "15"}};
        String[][] incorrect1 = {{"1", "2", "3", "4"},
                                {"5", "6", "7", "8"},
                                {"9", "10", "11", "12"}};
        String[][] incorrect2 = {{"1", "2", "3", "4"},
                                {"5", "6", "@", "8"},
                                {"9", "b", "11", "12"},
                                {"13", "14", "15", "16"}};
        String[][] incorrect3 = {{"1", "2", "3", "4"},
                                {"5", "6", "@", "8"},
                                {"9", "b", "11", "12"},
                                {"13", "14", "15", "16"},
                                {"17"}};
        WorkingArray array = new WorkingArray(correct);
        WorkingArray array1 = new WorkingArray(incorrect);
        WorkingArray array2 = new WorkingArray(incorrect1);
        WorkingArray array3 = new WorkingArray(incorrect2);
        WorkingArray array4 = new WorkingArray(incorrect3);
        try {
            array.arrayWork();
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
        try {
            array1.arrayWork();
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
        try {
            array2.arrayWork();
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
        try {
            array3.arrayWork();
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
        try {
            array4.arrayWork();
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
    }
}
