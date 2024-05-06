package Kuliah.Semester_2.MID_Term;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stok {
    String kode_barang;
    String nama;
    String kategori;
    int stok;

    public Stok(String kb, String nm, String katri, int sk) {
        this.kode_barang = kb;
        this.nama = nm;
        this.kategori = katri;
        this.stok = sk;
    }
}

class StokManager {
    ArrayList<Stok> data_barang;
    //Array Data Barang
    public StokManager() {
        data_barang = new ArrayList<>();
    }
    //Tambah Data Baru
    public void tambah_barang(String kode_barang, String nama, String kategori, int stok) {
        Stok item = new Stok(kode_barang, nama, kategori, stok);
        data_barang.add(item);
    }
    //Menampilkan  Semua Data Barang
    public void tampilkan_semua() {
        for (Stok item : data_barang) {
            System.out.println("Kode Barang: " + item.kode_barang);
            System.out.println("Nama: " + item.nama);
            System.out.println("Kategori: " + item.kategori);
            System.out.println("Stok: " + item.stok);
            System.out.println();
        }
    }
    //Mengurutkan  Berdasarkan Kode Barang Dan Stock Barang
    public void urutkan_stok() {
        Collections.sort(data_barang, Comparator.comparingInt(item -> item.stok));
    }
    //Cari Barang Berdasarkan Nama
    public void Stok_kosong() {
        boolean kosong = true;
        for (Stok item : data_barang) {
            if (item.stok == 0) {
                System.out.println("Kode Barang: " + item.kode_barang);
                System.out.println("Nama: " + item.nama);
                System.out.println("Kategori: " + item.kategori);
                System.out.println("Stok: " + item.stok);
                System.out.println();
                kosong = false;
            }
        }
        if (kosong) {
            System.out.println("Tidak ada barang dengan stok kosong.");
        }
    }
    //Mendisplay  semua barang yg mempunyai kata tertentu di nama mereka
    public void DisplayPosition(String kata_kunci) {
        for (Stok item : data_barang) {
            if (item.nama.toLowerCase().contains(kata_kunci.toLowerCase())) {
                System.out.println("Kode Barang: " + item.kode_barang);
                System.out.println("Nama: " + item.nama);
                System.out.println("Kategori: " + item.kategori);
                System.out.println("Stok: " + item.stok);
            }
        }
    }
}
