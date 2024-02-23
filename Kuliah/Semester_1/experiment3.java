import java.util.Scanner;

public class experiment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String category;
        int income,netsalary;
        double tax;

        System.out.println("Masukan Kategori : ");
        category = input.nextLine();
        System.out.println("Masukan Income: ");
        income = input.nextInt();

        if(category.equalsIgnoreCase("Worker")){
            if(income <= 2000000)
                tax = 0.1;
            else if(income <=3000000)
                tax = 0.15;
            else 
                tax= 0.2;
            netsalary = (int) (income - (tax*income));
            System.out.println("Net Salary = "+netsalary);
        }else if(category.equalsIgnoreCase("bussinesman")){
            if(income <=2500000)
                tax = 0.15;
            else if (income <= 3500000)
                tax = 0.2;
            else 
                tax = 0.25;
                netsalary = (int) (income - (tax*income));
                System.out.println("Net Salary = "+netsalary);
        }else
            System.out.println("Kategori salah!!!!");



        






    }
}