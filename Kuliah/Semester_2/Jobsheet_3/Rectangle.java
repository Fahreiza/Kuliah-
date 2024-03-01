package Kuliah.Semester_2.Jobsheet_3;

class Rectangle {
    public int Base;
    public int height;

    public int countArea() {
        return Base * height;
    }

    public int countPerimeter() {
        return 2 * (Base + height);
    }
}