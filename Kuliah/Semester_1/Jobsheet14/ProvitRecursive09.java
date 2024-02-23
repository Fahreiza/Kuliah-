package Jobsheet14;
import java.util.Scanner;

public class ProvitRecursive09 {
    private static String base;

    static double calculateProfit(double Balance, int Period) {
        if (Period == 0)
            return Balance;
        else
            return 1.11 * calculateProfit(Balance, Period - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Balance: ");
        double initialBalance = input.nextInt();
        System.out.print("Input Investment Period: ");
        int investPeriod = input.nextInt();
        System.out.println("Balance after  " + base + " year = " + calculateProfit(initialBalance, investPeriod));
    }
}