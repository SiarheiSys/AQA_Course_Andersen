package Lesson_7;

import java.io.File;

public class MainApp {
    public static void main(String[] args) {
        AppData header = new AppData(new String[]{"Value1", "Value2", "Value3"});
        AppData data = new AppData(new int[][]{{100, 200, 123},
                                                {300, 400, 500}});
        Output output = new Output();
        File file = new File("base.csv");
        Input input = new Input();
        output.saveHeader(header);
        output.saveData(data);
        input.read(file);
    }
}
