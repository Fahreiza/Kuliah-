package Jobsheet7;

import java.util.Scanner;

public class Formutiple09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int multiple;
        int sum = 0;
        int counter = 0;
        int average;

        System.out.println("input the multiple =");
        multiple = input09.nextInt();

        for (int i = 1; i < 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
                average = sum / counter;
            }
        }

        System.out.printf("There are d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        // System.out.printf("The average is %d", average);

    }

}
