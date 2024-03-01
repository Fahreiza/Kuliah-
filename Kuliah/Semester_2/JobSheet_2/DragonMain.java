package Kuliah.Semester_2.JobSheet_2;

public class DragonMain {
        public static void main(String[] args) {
            Dragon dragon = new Dragon(50,100);
                dragon.printPosition();
                dragon.moveLeft();
                dragon.moveDown();
                dragon.moveDown();
                dragon.moveRight();
                for(int i= 0;i<50;i++){
                dragon.moveDown();
            }
    }
}

