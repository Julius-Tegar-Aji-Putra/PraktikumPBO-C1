/**
 * File       : Manajer.java
 * Deskripsi  : berisi atribut dan method dalam class Manajer
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

public class Manager extends Pegawai{
    private static int tunjangan = 7000000;

    public Manager(String nama) {
        super.setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }

}
