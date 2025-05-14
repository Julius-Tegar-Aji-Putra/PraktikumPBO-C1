/**
 * File       : Programmer.java
 * Deskripsi  : berisi atribut dan method dalam class Programmer
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

public class Programmer extends Pegawai{
    private static int bonus = 450000;
    
    public Programmer(String nama) {
        super.setNama(nama);
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
