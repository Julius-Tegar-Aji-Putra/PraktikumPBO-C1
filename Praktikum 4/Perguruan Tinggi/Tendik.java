/**
 * File       : Tendik.java
 * Deskripsi  : berisi atribut dan method dalam class Tendik
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;
    
    public Tendik(String NIP, String Nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String bidang) {
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }
    
    public String getBidang() {
        return bidang;
    }
    
    public Tanggal hitungBUP() {
        Tanggal tanggalBUP = getTanggalLahir().tambahTahun(BUP);
        return tanggalBUP.TanggalSatuBulanBerikutnya();
    }

    public double hitungTunjangan() {
        return 0.01 * getMasaKerjaTahun() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println(String.format("%-30s: %s", "NIP", getNIP()));
        System.out.println(String.format("%-30s: %s", "Nama", getNama()));
        System.out.println(String.format("%-30s: %s", "Tanggal Lahir", getTanggalLahir()));
        System.out.println(String.format("%-30s: %s", "TMT", getTMT()));
        System.out.println(String.format("%-30s: %s", "Jabatan", "Tendik"));
        System.out.println(String.format("%-30s: %s", "Bidang", this.bidang));
        System.out.println(String.format("%-30s: %s", "Masa Kerja", getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan"));
        System.out.println(String.format("%-30s: %s", "BUP", this.hitungBUP()));
        System.out.println(String.format("%-30s: %s", "Gaji Pokok", "Rp " + String.format("%,.2f", getGajiPokok())));
        System.out.println(String.format("%-30s: %s", "Tunjangan", "15% x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp. " + 
                          String.format("%,.2f", hitungTunjangan())));
    }
}
