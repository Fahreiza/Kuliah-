package Kuliah.Semester_2.MID_Term;

import java.util.Scanner;

public class StokMain {
    public static void main(String[] args) {
        StokManager stokManager = new StokManager();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa barang
        stokManager.tambah_barang("16030927", "Indomilk", "Minuman", 100);
        stokManager.tambah_barang("16100617", "Sprite", "Minuman", 70);
        stokManager.tambah_barang("16240401", "Yakult", "Minuman", 500);
        stokManager.tambah_barang("16270525", "Indomie", "Makanan", 250);
        stokManager.tambah_barang("16971204", "Oreo", "Makanan", 320);
        stokManager.tambah_barang("16100727", "Chocochips", "Makanan", 120);
        stokManager.tambah_barang("16460329", "Ballpoint", "Alat Tulis", 75);
        stokManager.tambah_barang("16320421", "Pensil", "Alat Tulis", 110);
        stokManager.tambah_barang("16180729", "Buku ", "Alat Tulis", 57);

        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("=================================");
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Urutkan Stok Barang");
            System.out.println("4. Tampilkan Barang dengan Stok Kosong");
            System.out.println("5. Cari Barang berdasarkan Kata Kunci");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline
            switch (pilihan) {
                case 1:
                    // Memasukkan data barang baru
                    System.out.println("Masukkan data barang");
                    System.out.print("Kode: ");
                    String kode = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Kategori: ");
                    String kategori = scanner.nextLine();
                    System.out.print("Stok: ");
                    int stok = scanner.nextInt();
                    stokManager.tambah_barang(kode, nama, kategori, stok);
                    System.out.println("Barang berhasil ditambahkan.");
                    break;
                case 2:
                    // Menampilkan semua barang
                    System.out.println("Daftar Barang:");
                    stokManager.tampilkan_semua();
                    break;
                case 3:
                    // Mengurutkan stok barang
                    stokManager.urutkan_stok();
                    System.out.println("Stok Barang telah diurutkan.");
                    break;
                case 4:
                    // Menampilkan barang dengan stok kosong
                    System.out.println("Barang dengan Stok Kosong:");
                    stokManager.Stok_kosong();
                    break;
                case 5:
                    // Mencari barang berdasarkan kata kunci
                    System.out.print("Masukkan kata kunci: ");
                    String kataKunci = scanner.nextLine();
                    System.out.println("Hasil Pencarian:");
                    stokManager.DisplayPosition(kataKunci);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
