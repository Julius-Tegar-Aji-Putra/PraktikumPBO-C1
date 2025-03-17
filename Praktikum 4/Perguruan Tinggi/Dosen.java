/**
 * File       : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class Dosen extends Pegawai{
    private String Fakultas;

    public Dosen(String NIP, String Nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String Fakultas) {
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    public String getFakultas() {
        return Fakultas;
    }
}
