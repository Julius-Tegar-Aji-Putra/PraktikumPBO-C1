/**
 * File       : Anjing.java
 * Deskripsi  : berisi atribut dan method dalam class Anjing
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 08 Mei 2025
 */

 public class Anjing extends Anabul {
    public Anjing(String nama) {
        super.setNama(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Gerak : Melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Suara : Guk guk");
    }
}
