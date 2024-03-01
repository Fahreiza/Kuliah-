import java.util.Scanner;

public class Perulangan {
    public static void printSeries(int n) {
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();
        int lastTwoDigits = Integer.parseInt(nim.substring(nim.length() - 2));

        if (lastTwoDigits < 10) {
            lastTwoDigits += 10;
        }

        printSeries(lastTwoDigits);
    }
}
