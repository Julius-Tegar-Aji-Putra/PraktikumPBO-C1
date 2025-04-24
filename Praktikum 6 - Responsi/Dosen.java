/**
 * File       : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Maret 2025
 */

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counterDosen = 0;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    public Fakultas getFakultas() {
        return this.fakultas;
    }

    public static int getCounterDosen() {
        return counterDosen;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void printInfo() {
        System.out.println("Dosen:");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIP: " + getNIP());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: " + String.format("%.2f", hitungGaji()));
    }
}
