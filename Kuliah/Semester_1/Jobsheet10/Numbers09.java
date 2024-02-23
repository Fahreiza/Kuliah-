package Jobsheet10;
import java.util.Arrays;
import java.util.Scanner;

public class Numbers09 {


    public static void main(String[] args) {

        int[][] mynumbers = new int[3][5];
        mynumbers[0] = new int[5];
        mynumbers[1] = new int[3];
        mynumbers[2] = new int[1];

        for (int i = 0; i < mynumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + mynumbers[i].length);
        }
    }
}


