/**
 * File       : Kucing.java
 * Deskripsi  : berisi atribut dan method dalam class Kucing
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

 public class Kucing extends Anabul{
    public Kucing(String nama) {
        super.setNama(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Kucing : Melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Kucing : Meong");
    }
}
