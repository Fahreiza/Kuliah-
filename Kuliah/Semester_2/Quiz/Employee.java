package Kuliah.Semester_2.Quiz;

public class Employee {
    public String nama;
    public int age;
    public int gaji1;
    public int gaji2;
    public int gaji3;
    public int livingAllowance;
    public int transportationAllowance;

    // cons
    public Employee(String nama, int age, int g1, int g2, int g3, int LA, int Ta) {
        this.nama = nama;
        this.age = age;
        this.gaji1 = g1;
        this.gaji2 = g2;
        this.gaji3 = g3;
        this.livingAllowance = LA;
        this.transportationAllowance = Ta;
    }

    // method
    public double getAge() {
        return age;
    }

    // Rata Rata
    public double Rataratagaji() {
        return (gaji1 + gaji2 + gaji3) / 3.0;
    }

    // Total gaji+Tunjangan
    public int Totalgaji() {
        return gaji1 + gaji2 + gaji3 + livingAllowance + transportationAllowance;
    }

    // Display
    public void printData() {
        System.out.println("Name: " + nama);
        System.out.println("Umur: " + age);
        System.out.println("Gaji1: " + gaji1);
        System.out.println("Gaji2: " + gaji2);
        System.out.println("Gaji3: " + gaji3);
        System.out.println("Total Gaji: " + Totalgaji());
        System.out.println("Rata Rata Gaji: " + Rataratagaji());
        System.out.println("Living Allowance: " + livingAllowance);
        System.out.println("Transportation Allowance: " + transportationAllowance);
    }
}