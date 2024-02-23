package Jobsheet13;

import java.util.Scanner;

public class CubeStudent09 {
    public static void main(String[] args) {
        int numStudents = 5;
        int numWeeks = 7;
        String[] studentNames = new String[numStudents];
        int[][] weeklyGrades = new int[numStudents][numWeeks];

        // Input student names
        inputStudentNames(studentNames);

        // Input grades
        inputGrades(studentNames, weeklyGrades);

        // Display grades
        displayGrades(studentNames, weeklyGrades);

        // Find and display the student with the highest grade
        int highestStudent = findHighestStudent(studentNames, weeklyGrades);
        System.out.println("Student with the highest grade: " + studentNames[highestStudent - 1]);
    }

    // Function to input student names
    private static void inputStudentNames(String[] names) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name for Student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
    }

    // Function to input grades for each student for each week
    private static void inputGrades(String[] names, int[][] grades) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter grades for " + names[i] + ":");
            for (int j = 0; j < grades[i].length; j++) {
                while (true) {
                    try {
                        System.out.print("Week " + (j + 1) + ": ");
                        grades[i][j] = scanner.nextInt();
                        break;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.nextLine(); // Consume the invalid input
                    }
                }
            }
        }
    }

    // Function to display the weekly grades
    private static void displayGrades(String[] names, int[][] grades) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("\nWeek-wise grades for " + names[i] + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println("Week " + (j + 1) + ": " + grades[i][j]);
            }
        }
    }

    // Function to find the student with the highest grade
    private static int findHighestStudent(String[] names, int[][] grades) {
        int highestStudent = 1; // Assuming the first student initially
        int maxGrade = calculateTotalGrade(grades[0]); // Assuming the first student initially

        for (int i = 1; i < grades.length; i++) {
            int total = calculateTotalGrade(grades[i]);

            // If the total is greater than the current maxGrade, update maxGrade and highestStudent
            if (total > maxGrade) {
                maxGrade = total;
                highestStudent = i + 1; // Adding 1 to convert index to student number
            }
        }

        // Display grade information for the highest student
        System.out.println("\nGrade information for the student with the highest grade (" + names[highestStudent - 1] + "):");
        displayGradesForStudent(names[highestStudent - 1], grades[highestStudent - 1]);

        return highestStudent;
    }

    // Function to calculate the total grade for a student
    private static int calculateTotalGrade(int[] studentGrades) {
        int total = 0;
        for (int grade : studentGrades) {
            total += grade;
        }
        return total;
    }

    // Function to display grade information for a specific student
    private static void displayGradesForStudent(String name, int[] studentGrades) {
        System.out.println("Week-wise grades:");
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.println("Week " + (i + 1) + ": " + studentGrades[i]);
        }
    }
}
