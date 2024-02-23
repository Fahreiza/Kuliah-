
import java.util.Scanner;

public class Selection1StudentIDNumber {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.println("Input a number = ");
        int number = input16.nextInt();
        // ini Adalah Ternary Operator
        String output = (number%2 == 0) ? number+" is an even number!" : number+" is an odd number!";
        System.out.println(output);
       
        // if (number%2 == 0) {
        //     System.out.println(number+" is an even number!");
        // } else {
        //     System.out.println(number+" is an odd number!");
        // }
    }
}