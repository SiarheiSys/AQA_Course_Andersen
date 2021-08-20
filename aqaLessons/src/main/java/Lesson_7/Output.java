package Lesson_7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output {

    public void saveHeader(AppData p, File file) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < p.getHeader().length; i++) {
                out.write(p.getHeader()[i]);
                if (i < p.getHeader().length - 1) {
                    out.write(";");
                }
            }
            out.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveData(AppData p, File file) {
        String str;
        try (BufferedWriter out = new BufferedWriter(new FileWriter("base.csv", true))) { //Если не добавить true в append,
            // то заголовок в файле затрётся
            for (int i = 0; i < p.getData().length; i++) {
                for (int j = 0; j < p.getData()[i].length; j++) {
                    str = String.valueOf(p.getData()[i][j]); // Сначала просто закинул p.getData()[i][j] в out.write().
                    // В итоге записывалось непонятно что. В итоге дошло, что p имеет тип int, а потому write() воспринимает
                    // не как число, а как байтовое значение. Поэтому привёл p.getData()[i][j] к строковому типу.
                    // toString() здесь не срабатывает. Пока не понял, почему.
                    out.write(str);
                    if (j < p.getData()[i].length - 1) {
                        out.write(";");
                    }
                }
                out.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
