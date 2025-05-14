/**
 * File       : MAnabul.java
 * Deskripsi  : berisi Main driver untuk Anabul menggunakan generik Datum
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 30 April 2025
 */

 public class MAnabul {
    public static void main(String[] args) {
        Datum<Anabul> dataAnjing = new Datum<>();
        Datum<Anabul> dataKucing = new Datum<>();
        Datum<Anabul> dataBurung = new Datum<>();

        dataAnjing.setIsi(new Anjing("Fur"));
        dataKucing.setIsi(new Kucing("Hilmi"));
        dataBurung.setIsi(new Burung("Hawks"));

        System.out.println("Gerakan Hewan :");
        dataAnjing.getIsi().Gerak();
        dataKucing.getIsi().Gerak();
        dataBurung.getIsi().Gerak();

        System.out.println("Suara Hewan :");
        dataAnjing.getIsi().Bersuara();
        dataKucing.getIsi().Bersuara();
        dataBurung.getIsi().Bersuara();
    }
}
