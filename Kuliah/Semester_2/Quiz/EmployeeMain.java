package Kuliah.Semester_2.Quiz;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        //Input informasi
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter information for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String nama = sc.nextLine();
            System.out.print("Umur: ");
            int age = sc.nextInt();
            System.out.print("Gaji Pertama: ");
            int gaji1 = sc.nextInt();
            System.out.print("Gaji Kedua: ");
            int gaji2 = sc.nextInt();
            System.out.print("Gaji Ketiga: ");
            int gaji3 = sc.nextInt();
            sc.nextLine();
            System.out.print("Tunjangan Hidup: ");
            int livingAllowance = sc.nextInt();
            System.out.print("Tunjangan Kendaraan: ");
            int transportationAllowance = sc.nextInt();
            sc.nextLine();

            employees[i] = new Employee(nama, age, gaji1, gaji2, gaji3, livingAllowance, transportationAllowance);
        }
        //mencari gaji tertinggi
        Employee gaji_tertinggi = employees[0];
        for (int i = 1; i < 3; i++) {
            if (employees[i].Totalgaji() > gaji_tertinggi.Totalgaji()) {
                gaji_tertinggi = employees[i];
            }
        }
        //mencari tunjangan terbesar berdasarkan gaji yang di dapat dan umur karyawan
        Employee TunjanganTerbesar = null;
        int Makstunjangan = 0;
        for (int i = 0; i < 3; i++) {
                if (employees[i].getAge() >= 35 && employees[i].getAge() <= 50) {
                    int totalSalary = employees[i].Totalgaji();
                    if (totalSalary > Makstunjangan) {
                        Makstunjangan = totalSalary;
                        TunjanganTerbesar = employees[i];
                    }
            }
        }
        //display tunjangan terbesar dari umur 35-50
        System.out.println("\nBiggest allowance of employees aged 35 to 50:");
        if (TunjanganTerbesar != null) {
            TunjanganTerbesar.printData();
        }//jika tidak ada yang ber umur 35-50
         else {
            System.out.println("No employees aged 35 to 50 found.");
        }
        //pendapatan terbesar
        System.out.println("\nEmployee with the highest total salary: ");
        gaji_tertinggi.printData();
    }
}