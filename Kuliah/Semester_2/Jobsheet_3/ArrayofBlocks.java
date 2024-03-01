package Kuliah.Semester_2.Jobsheet_3;

public class ArrayofBlocks {
    public static void main(String[] args) {
        Blocks[] bl = new Blocks[3]; // membuat array dari kelas blocks dan memiliki panjang 3

        bl[0] = new Blocks(100, 30, 12);
        bl[1] = new Blocks(120, 40, 15);
        bl[2] = new Blocks(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume bloks - " + i + " : " + bl[i].CountVolume());
        }
    }
}
