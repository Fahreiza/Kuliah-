package Kuliah.Semester_2.Jobsheet_3;

public class Blocks {
    public int width, length, height;

    public Blocks(int w, int l, int h) {
        length = l;
        width = w;
        height = h;
    }

    // Method untuk menghitung luas permukaan dari blok
    public int CountVolume() {
        return length * width * height;
    }
}
