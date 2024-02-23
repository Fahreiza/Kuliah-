package Jobsheet13;

import java.util.Scanner;

public class Cube {
    static double calculateArea(int sisi ){
        double area = 0;
        area = 6*sisi*sisi;
        return area;

    }
    static double calculateVolume(int sisi){
        double volume = 0;
        volume = sisi*sisi*sisi;
        return volume;
    }
    public static void main(String[] args) {
        double area = calculateArea(10);
        double volume = calculateVolume(10);

        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka = ");
        int sisi = input.nextInt();
        area = calculateArea(sisi);
        volume = calculateVolume(sisi);
        System.out.println("area = "+area);
        System.out.println("Volume = "+volume);
        
    }

}
