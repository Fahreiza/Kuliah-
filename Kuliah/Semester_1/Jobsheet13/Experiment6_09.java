package Jobsheet13;

import java.util.Scanner;

public class Experiment6_09 {
    static int calculateArea(int l,int w){
        int area = l*w;
        return area;
    }
    static int calculateVolume(int l,int w, int h){
        int vol = calculateArea(l, w)*h;
        return vol;
    }

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int p, l, t, L, vol;
          System.out.println("Input length = ");
          p = input.nextInt();
          System.out.println("Input Width = ");
          l = input.nextInt();
          System.out.println("Input height = ");
          t = input.nextInt();
          
        //   L=p*l;
          L=calculateArea(p, l);    
          System.out.println("area of the rectangle = "+ L);
        //   vol=p*l*t;
          vol= calculateVolume(t, p, l);
          System.out.println("Vol of the rectangle = "+ vol);
    }
    
}
