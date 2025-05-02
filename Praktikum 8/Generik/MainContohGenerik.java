/**
 * File       : MainContohGenerik.java
 * Deskripsi  : program utama untuk simulasi menggunakan ContohMetodeGenerik
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 30 April 2025
 */

public class MainContohGenerik {
    public static void main(String[] args) {
        Datum<Anjing> dataAnjing = new Datum<>(); 
        Datum<Kucing> dataKucing = new Datum<>(); 
        Datum<Burung> dataBurung = new Datum<>();
        
        dataAnjing.setIsi(new Anjing("Fur"));
        dataKucing.setIsi(new Kucing("Hilmi"));
        dataBurung.setIsi(new Burung("Hawks"));
        
        System.out.println("Gerakan Hewan dan Suara Hewan :");
        ContohMetodeGenerik.tampilkanPerilaku(dataAnjing);
        ContohMetodeGenerik.tampilkanPerilaku(dataKucing);
        ContohMetodeGenerik.tampilkanPerilaku(dataBurung);
    }
}
