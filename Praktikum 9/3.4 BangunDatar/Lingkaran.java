/**
 * File     : Lingkaran.java
 * Deskripsi: implementasi Lingkaran sebagai BangunDatar
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 07 Mei 2025
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }

    public double hitungLuas() {
        return jejari * jejari * 22.0/7.0;
    }
}

