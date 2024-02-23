
import java.util.Scanner;

public class experiment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.println("input year : ");
        year =input.nextInt();
    if (year % 400 == 0) {
      System.out.println(year + " Leap year");
    }
    else if (year % 100 == 0) {
      System.out.println(year + " Not leap year");
    }
    else if (year % 4 == 0) {
      System.out.println(year + " Leap year ");
    }
    else {
      System.out.println(year + " Not leap year ");
    }

     input.close();

    }
}