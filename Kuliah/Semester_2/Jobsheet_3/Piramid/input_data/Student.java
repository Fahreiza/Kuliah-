package Kuliah.Semester_2.Jobsheet_3.Piramid.input_data;

public class Student {
    public String name;
    public String nim;
    public String gender;
    public double gpa;

    public Student(String nam, String ni, String gen, double gp) {
        name = nam;
        nim = ni;
        gender = gen;
        gpa = gp;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
    }

    public double getGpa() {
        return gpa;
    }
}
