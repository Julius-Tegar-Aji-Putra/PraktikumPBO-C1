/**
 * File       : Tendik.java
 * Deskripsi  : berisi atribut dan method dalam class Tendik
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Maret 2025
 */

public class Tendik extends Karyawan{
    private static final double gajiPokokT = 4000000.0;
    private static int counterTendik = 0;

    public Tendik (String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        counterTendik++;
    }

    public static int getCounterTendik() {
        return counterTendik;
    }

    @Override
    public double hitungGaji() {
        return gajiPokokT + (getMasaKerja() * 0.01 * gajiPokokT);
    }

    @Override
    public void printInfo() {
        System.out.println("Tendik:");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIP: " + getNIP());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Gaji: " + String.format("%.2f", hitungGaji()));
    }
}
