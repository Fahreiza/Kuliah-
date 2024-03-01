package Kuliah.Semester_2.Jobsheet_3.Piramid.input_data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(name, nim, gender, gpa);
        }
        Student gpa_tertingi = students[0];
        for (int i = 1; i < 3; i++) {
            if (students[i].getGpa() > gpa_tertingi.getGpa()) {
                gpa_tertingi = students[i];
            }
        }

        System.out.println("Informasi Mahasiswa");
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].displayInfo();
        }

        System.out.println("\nStudent with highest GPA:");
        gpa_tertingi.displayInfo();

    }
}