package Lesson_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {

    public void read(File file) {
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            //Не по условию, так как считывает посимвольно. Зато разобрался.
            //int byte = 0;
            //StringBuilder str = new StringBuilder();
            //while ((byte = in.read()) != -1) {
            //    str.append(Character.toChars(byte));
            //}
            //  System.out.println(str);
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
