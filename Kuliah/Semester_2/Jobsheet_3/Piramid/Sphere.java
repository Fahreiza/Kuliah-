package Kuliah.Semester_2.Jobsheet_3.Piramid;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        radius = radius;
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
