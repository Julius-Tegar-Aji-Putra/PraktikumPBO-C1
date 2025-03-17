/**
 * File       : Pegawai.java
 * Deskripsi  : berisi atribut dan method dalam class Pegawai
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class Pegawai {
    private String NIP;
    private String Nama;
    private Tanggal tanggalLahir; 
    private Tanggal TMT;
    private double gajiPokok;
    public static final Tanggal today = new Tanggal(10, "Maret", 2025);

    public Pegawai(String NIP, String Nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public Tanggal getTanggalLahir() {
        return tanggalLahir;
    }

    public Tanggal getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public int[] getMasaKerja() {
        return Tanggal.getHitungMasa(this.TMT, today);
    }

    public int getMasaKerjaTahun() {
        return getMasaKerja()[0];
    }

    public int getMasaKerjaBulan() {
        return getMasaKerja()[1];
    }

    public void printInfo() {
        System.out.println(String.format("%-30s: %s", "NIP", this.NIP));
        System.out.println(String.format("%-30s: %s", "Nama", this.Nama));
        System.out.println(String.format("%-30s: %s", "Tanggal Lahir", this.tanggalLahir));
        System.out.println(String.format("%-30s: %s", "TMT", this.TMT));
    }
    
    public void printInfoBawah() {
        System.out.println(String.format("%-30s: %s", "Masa Kerja", getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan"));
        System.out.println(String.format("%-30s: %s", "Gaji Pokok", "Rp " + String.format("%,.2f", this.gajiPokok)));
    }
}



