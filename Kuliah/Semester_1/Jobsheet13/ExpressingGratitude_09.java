package Jobsheet13;

import java.util.Scanner;

public class ExpressingGratitude_09 {
    public static String getGreetingRecipient() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thanks You "+name+ " For Being The Best Teacher In The World. \n" +
                "you Inspired in me a love for learning and made me feel like i could ask you anything");

    }
    public static void main(String[] args) {
        sayThankyou();
    }
}
