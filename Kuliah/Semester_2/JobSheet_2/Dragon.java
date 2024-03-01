package Kuliah.Semester_2.JobSheet_2;

public class Dragon {

    int x, y, height, width;

    public Dragon(int w, int h) {
        x = w / 2;
        y = h / 2;
        height = h;
        width = w;
    }

    void moveLeft() {
        if (x > 0)
            x = x - 1;
        printPosition();
        detectCollision();

    }

    void moveRight() {
        if (x < width)
            x = x + 1;
        printPosition();
        detectCollision();

    }

    void moveUp() {
        if (y > 0)
            y = y - 1;
        printPosition();
        detectCollision();

    }

    void moveDown() {
        if (y < height)
            y = y + 1;
        printPosition();
        detectCollision();

    }

    void printPosition() {
        System.out.printf("Dragon's position is: X=%d Y=%d\n", x, y);
        System.out.println();
    }

    void detectCollision() {
        if (x <= 0 || y <= 0 || x >= width || y >= height)
            System.out.println("Game Over ");

    }
}