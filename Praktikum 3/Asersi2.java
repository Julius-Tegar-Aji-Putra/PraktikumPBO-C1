/**
 * File       : Asersi2.java
 * Deskripsi  : Program untuk demo asersi, yang akan menolak input
 *              jari-jari lingkaran yang bernilai nol
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 7 Maret 2025
 */

// Class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKelingking() {
        double kelling = 2 * Math.PI * jariJari;
        return kelling;
    }
}

// Class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        
        // Memastikan jari-jari lebih besar dari 0
        assert (jariJari > 0) : "jari-jari tidak boleh nol!!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kellingLingkaran = l.hitungKelingking();
        
        System.out.println("keliling lingkaran = " + kellingLingkaran);
    }
}

// Program ini tidak sesuai secara konsep karena disini asersi seharusnya 
// asersi digunakan hanya untuk pada saat debugging karena secara konsep asersi
// seharusnya tidak berjalan pada saat kompilasi user normal maka jari-jari
// lingkaran walaupun nilainya tidak sesuai tetapi program tetap berjalan
// dengan hasil yang tidak sesuai karena berjalan pada kondisi normal bukan kondisi debugging
// seharusnya program ini menggunakan if
// untuk menolak input jari-jari lingkaran yang bernilai nol