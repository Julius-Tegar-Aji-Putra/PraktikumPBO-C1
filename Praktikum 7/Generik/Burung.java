/**
 * File       : Burung.java
 * Deskripsi  : berisi atribut dan method dalam class Burung
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 30 April 2025
 */

 public class Burung extends Anabul {
    public Burung(String nama) {
        super.setNama(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Burung : Terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println("Burung : Cuit");
    }
}