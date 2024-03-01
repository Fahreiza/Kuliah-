package Kuliah.Semester_2.JobSheet_1;

import java.util.Scanner;

public class NA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = { "Tugas", "Kuis", "UTS", "UAS" };
        double[] value = new double[input.length];
        double[] require = { 0.2, 0.2, 0.3, 0.4 };
        String[] grade = { "A", "B+", "B", "C+", "C", "D", "E" };
        int[][] threshold = { { 80, 100 }, { 73, 80 }, { 65, 73 }, { 60, 65 }, { 50, 60 }, { 39, 50 }, { 0, 39 } };

        double total = 0;
        String result = "";

        System.out.println("{Program Menghitung Nilai Akhir}");
        System.out.println("================================");
        for (int i = 0; i < input.length; i++) {
            System.out.printf("Masukkan Nilai %s: ", input[i]);
            value[i] = sc.nextInt();

            while (value[i] < 0 || value[i] > 100) {
                System.out.print("\nNilai tidak valid Masukkan nilai lagi: ");
                value[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < value.length; i++) {
            value[i] *= require[i];
            total += value[i];
        }

        System.out.println("Total Nilai: " + total);

        
        for (int i = 0; i < threshold.length; i++) {
            if (total >= threshold[i][0] && total <= threshold[i][1]) {
                result = grade[i];
                break;
            }
        }

        System.out.println("Grade: " + result);
    }
}
