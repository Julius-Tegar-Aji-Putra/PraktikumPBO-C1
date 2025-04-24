/**
 * File       : Fakultas.java
 * Deskripsi  : berisi atribut dan method dalam class Fakultas
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Maret 2025
 */

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return this.nama;
    }

    public double getTarifUKT(){
        return this.tarifUKT;
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}
