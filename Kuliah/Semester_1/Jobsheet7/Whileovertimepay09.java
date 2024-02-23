package Jobsheet7;

import java.util.Scanner;
public class Whileovertimepay09 {
    public static void main(String[] args) {
       Scanner input21 =  new Scanner(System.in);
       int numEmployee, overtimehours;
       double overtimepay=0;
       double totalOvertimePay=0;
       String position;

       System.out.print("Employee number = ");
       numEmployee = input21.nextInt();

       int i=0;
       while(i<numEmployee){
        System.out.print("Position of employee "+(i+1)+" (director, manager, staff) = ");
        position = input21.next();
        System.out.print("Employee "+(i+1)+" overtime hours = ");
        overtimehours = input21.nextInt();
        i++;

        if(position.equalsIgnoreCase("director")){
            continue;
        }else if(position.equalsIgnoreCase("manager")){
            overtimepay=overtimehours*100000;
        }else if(position.equalsIgnoreCase("Staff")){
            overtimepay=overtimehours*75000;
        } else {
            System.out.println("position invalid");
            i--;
            continue;
        }
        totalOvertimePay += overtimepay;
       }
       System.out.println("Total of the Overtime Pay = "+totalOvertimePay);


    }
}