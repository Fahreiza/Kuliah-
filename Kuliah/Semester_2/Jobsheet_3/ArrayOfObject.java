package Kuliah.Semester_2.Jobsheet_3;

import java.util.Scanner;

public class ArrayOfObject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle[] rectanglesArray = new Rectangle[4];
        System.out.println("--------Masukkan jumlah sisi persegi panjang-----");
        for (int i = 0; i < 4; i++) {
            rectanglesArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.println("Input Base :");
            rectanglesArray[i].Base = sc.nextInt();

            System.out.println("Input height :");
            rectanglesArray[i].height = sc.nextInt();
        }
        // Display Console
        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle" + i);
            System.out.println("height: " + rectanglesArray[0].height + ", Base " + rectanglesArray[0].Base);

        }
        // Membuat objek-objek dari kelas

        // rectanglesArray[0] = new Rectangle();
        // rectanglesArray[0].length = 110;
        // rectanglesArray[0].width = 30;

        // rectanglesArray[1] = new Rectangle();
        // rectanglesArray[1].length = 80;
        // rectanglesArray[1].width = 40;

        // rectanglesArray[2] = new Rectangle();
        // rectanglesArray[2].length = 100;
        // rectanglesArray[2].width = 20;

        System.out
                .println("First Rectangle, height: " + rectanglesArray[0].height + ",Base :" + rectanglesArray[0].Base);
        System.out.println(
                "Second Rectangle, height: " + rectanglesArray[1].height + ",Base :" + rectanglesArray[1].Base);
        System.out
                .println("Third Rectangle, height: " + rectanglesArray[2].height + ",Base :" + rectanglesArray[2].Base);
        System.out
                .println("Four Rectangle, height: " + rectanglesArray[3].height + ",Base :" + rectanglesArray[3].Base);
    }

}
