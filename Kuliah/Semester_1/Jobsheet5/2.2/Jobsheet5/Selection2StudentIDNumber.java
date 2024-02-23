import java.util.Scanner;

public class Selection2StudentIDNumber {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        float finalExam, midExam, quiz, assigment, total;
        
        System.out.println("Nilai Uas                : ");
        finalExam = input05.nextFloat();
        System.out.println("Nilai Uts                :");
        midExam = input05.nextFloat();
        System.out.println("Nilai Quiz               :");
        quiz = input05.nextFloat();
        System.out.println("Nilai Tugas              :");
        assigment = input05.nextFloat();

        total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assigment * 0.2F);
        // ini adalah Ternary
        String message = total < 65 ? "Retake" : "Pass";
        
        System.out.println("Final Grade  = "+ total +" and the decission is "+message);
        String predikat = "";
        if (total > 80 && total <= 100)
        {
        predikat = " A+";
        } else if ( total > 73 && total <= 80){
            predikat = " B+";
        } else if (total > 65 && total <= 73) {
            predikat = " B";
        }else if (total > 60 && total <= 65) {
            predikat = " C+";
        }else if (total > 50 && total <= 60) {
            predikat = " C";
        }else if (total > 39 && total <= 50){
            predikat = " D";
        } else {
            predikat = " E";
        }
        
        System.out.println("Predikat Nilai anda =" +predikat);
    }
}
