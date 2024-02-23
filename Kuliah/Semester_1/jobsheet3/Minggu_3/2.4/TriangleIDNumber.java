import java.util.Scanner;

public class TriangleIDNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, height;
        float area;

        System.out.println("Input base: ");
        base = scanner.nextInt();
        
        System.out.println("Input height: ");
        height = scanner.nextInt();
        
        area = (float)(base * height) / 2; 
        System.out.println("Area of the triangle: " + area);

        
        scanner.close();
    }
}
