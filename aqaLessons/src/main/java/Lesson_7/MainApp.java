package Lesson_7;

import java.io.File;

public class MainApp {
    public static void main(String[] args) {
        AppData header = new AppData(new String[]{"Value1", "Value2", "Value3"});
        AppData data = new AppData(new int[][]{{100, 200, 123},
                                                {300, 400, 500}});
        File file = new File("base.csv");
        Output output = new Output();
        Input input = new Input();
        output.saveHeader(header, file);
        output.saveData(data, file);
        input.read(file);
    }
}
