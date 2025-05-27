/**
 * File       : Karyawan.java
 * Deskripsi  : berisi atribut dan method dalam class Karyawan
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Maret 2025
 */

public abstract class Karyawan extends Civitasakademika{
    private String NIP;
    private int masaKerja;

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public String getNIP() {
        return this.NIP;
    }

    public int getMasaKerja() {
        return this.masaKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();
}
