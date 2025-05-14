/**
 * File       : ContohMetodeGenerik.java
 * Deskripsi  : berisi metode generik untuk mengendalikan objek Datum
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 30 April 2025
 */

public class ContohMetodeGenerik {
    public static <G extends Anabul> void tampilkanPerilaku(Datum<G> data){
        G Anabul = data.getIsi();
        Anabul.Gerak();
        Anabul.Bersuara();
    }
}
