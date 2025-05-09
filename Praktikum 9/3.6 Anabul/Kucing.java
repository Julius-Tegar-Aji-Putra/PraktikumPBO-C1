/**
 * File       : Kucing.java
 * Deskripsi  : berisi atribut dan method dalam class Kucing
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 08 Mei 2025
 */

 public class Kucing extends Anabul{
    public Kucing(String nama) {
        super.setNama(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Gerak : Melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Suara : Meong");
    }
}
