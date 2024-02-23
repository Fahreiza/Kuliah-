import java.util.Scanner;

public class Selection2Exp2StudentIDNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angle1,angle2,angle3;
        int total;

        System.out.println("Masukan angka angle1 : ");
        angle1 = input.nextInt();
        System.out.println("Masukan angka angle2 : ");
        angle2 =input.nextInt();
        System.out.println("Masukan angka angle3 : ");
        angle3 = input.nextInt();

        total = angle1+angle2+angle3;

        if(total == 180)
            if(angle1 == 90 || angle2 == 90 || angle3 == 90 )
            System.out.println("Right triangle");
            else
            System.out.println("Not a right triangle");
        else
            System.out.println("not a triangle");
    }
    
}
