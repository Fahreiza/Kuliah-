package Jobsheet13;

public class Experiment5_09 {
    
    static void show (String str, int...a){
    System.out.println("String: "+str);
    System.out.println("Number of arguments/parameter: "+ a.length  );

    for(int i : a){
        System.out.println(i + " ");
    }
    System.out.println();
}
public static void main(String[] args) {
    show("Programing Fudaentals 2023", 100,200);
    show("Information tecnology", 1,2,3,4,5);
    show("informatics");
}
}
