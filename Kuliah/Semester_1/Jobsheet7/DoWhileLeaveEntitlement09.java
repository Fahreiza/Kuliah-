package Jobsheet7;

import java.util.Scanner;

public class DoWhileLeaveEntitlement09 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int jatahcuti, jumlahhari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahcuti = input21.nextInt();

        do{
            System.out.print("Apakah Anda Ingin mengambil cuti (y/t)? ");
            konfirmasi = input21.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("jumlah hari: ");
                jumlahhari = input21.nextInt();

                if (jumlahhari <= jatahcuti) {
                    jatahcuti -= jumlahhari;
                    System.out.println("Sisa jatah cuti: " + jatahcuti);
                } else {
                System.out.println("Sisa jatah cuti anda tidak mencukupi ");
                continue;
                }
            } else {
                break;
            }
        } while (jatahcuti > 0);
    }
}

