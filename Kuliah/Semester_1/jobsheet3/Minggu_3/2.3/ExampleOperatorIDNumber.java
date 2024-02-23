public class ExampleOperatorIDNumber {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Initial value of x = "+ x);
        System.out.println("x++ = "+ x++); //x++ adalah post-increment dan menggunakan nilai saat ini sebelum diinkrementasikan.
        System.out.println("after evaluation , x = "+ x);
        x = 10;
        System.out.println("Initial value of x = "+ x);
        System.out.println("++x ="+ ++x); //adalah pre-increment dan menginkrementasikan x terlebih dahulu sebelum menggunakan nilai yang diperbarui.
        System.out.println("after evaluation , x = "+ x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("The result of x ^ y is "+ z);
        z %= 2;
        //6
        System.out.println("The final result is "+ z);


    }
}
