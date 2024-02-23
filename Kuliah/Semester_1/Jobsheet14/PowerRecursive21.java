package Jobsheet14;

import java.util.Scanner;

public class PowerRecursive21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int Power = input.nextInt();
        System.out.println("Result of " + base + " power " + Power + " = " + calculatePower(base, Power));

        printPower(base, Power);
    }

    static int calculatePower(int base, int pow) {
        if (pow == 0)
            return 1;
        else
            return base * calculatePower(base, pow - 1);
    }

    static void printPower(int base, int pow) {
        String series = "";
        for (int i = 0; i < pow; i++) {
            series += base;
            if (i < pow - 1) {
                series += "x";
            }
        }
        series += "x1";
        System.out.println(series + " = " + calculatePower(base, pow));
    }
}