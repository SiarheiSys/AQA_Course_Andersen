package Lesson_7;

public class AppData {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public AppData(String[] header) {
        this.header = header;
    }

    public AppData(int[][] data) {
        this.data = data;
    }
}
