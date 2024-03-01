package Kuliah.Semester_2.JobSheet_2;

public class buku {
    String judul, pengarang;
    int halaman, stok, harga;
    int hargaTotal;
    double diskon;
    int hrgaBayar;


    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
    int hitungHargaTotal(int jml) {
        hargaTotal = harga * jml;
        System.out.println("Harga total: " + hargaTotal);
        return hargaTotal;
    }

    double hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12; // diskon 12% untuk harga total > 150000
        } else if (hargaTotal >= 75000) {
            diskon = hargaTotal * 0.05; // diskon 5% untuk harga total >= 75000
        } else {
            diskon = 0; // Tidak ada diskon untuk harga total < 75000
        }
        System.out.println("Hitung harga setelah di diskon : " + diskon);
        return diskon;
    }

    double hargaBayar() {
        hrgaBayar = (int) (hargaTotal - diskon); // Harga yang harus dibayar adalah harga total dikurangi diskon
        System.out.println("Harga yang harus di bayar : " + hrgaBayar);
        return hrgaBayar;
    }




public buku(String jud, String pg, int hal, int stok, int har){
    judul = jud;
    pengarang = pg;
    halaman = hal;
    this.stok = stok;
    harga = har;

        }
    }