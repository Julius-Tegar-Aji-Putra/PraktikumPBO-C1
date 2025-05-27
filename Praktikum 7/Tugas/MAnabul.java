/**
 * File       : MAnabul.java
 * Deskripsi  : berisi Main driver untuk Anabul
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

public class MAnabul {
    public static void main(String[] args) {
        Anabul Anjing = new Anjing("Fur");
        Anabul Kucing = new Kucing("Hilmi");
        Anabul Burung = new Burung("Hawks");

        System.out.println("Gerakan Hewan :");
        Anjing.Gerak();
        Kucing.Gerak();
        Burung.Gerak();

        System.out.println("Suara Hewan :");
        Anjing.Bersuara();
        Kucing.Bersuara();
        Burung.Bersuara();
    }
}
