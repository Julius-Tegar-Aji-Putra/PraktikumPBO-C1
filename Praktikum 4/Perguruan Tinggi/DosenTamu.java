/**
 * File       : DosenTamu.java
 * Deskripsi  : berisi atribut dan method dalam class DosenTamu
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class DosenTamu extends Dosen{
    private String NIDK;
    private Tanggal tanggalBerakhirKontrak;

    public DosenTamu(String NIP, String Nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String Fakultas, String NIDK, Tanggal tanggalBerakhirKontrak) {
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNIDK() {
        return NIDK;
    }

    public Tanggal getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public int getSisaMasaKontrakBulan(){
        int totalBulan = Tanggal.getSelisihBulan(Pegawai.today, tanggalBerakhirKontrak);
        if (Pegawai.today.getHari() > tanggalBerakhirKontrak.getHari()) {
            totalBulan -= 1;
        }
        return totalBulan;
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println(String.format("%-30s: %s", "NIP", getNIP()));
        System.out.println(String.format("%-30s: %s", "NIDK", this.NIDK));
        System.out.println(String.format("%-30s: %s", "Nama", getNama()));
        System.out.println(String.format("%-30s: %s", "Tanggal Lahir", getTanggalLahir()));
        System.out.println(String.format("%-30s: %s", "TMT", getTMT()));
        System.out.println(String.format("%-30s: %s", "Jabatan", "Dosen Tamu"));
        System.out.println(String.format("%-30s: %s", "Fakultas", getFakultas()));
        System.out.println(String.format("%-30s: %s", "Masa Kerja", getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan"));
        System.out.println(String.format("%-30s: %s", "Masa Kontrak Berakhir", getSisaMasaKontrakBulan() + " bulan"));
        System.out.println(String.format("%-30s: %s", "Gaji Pokok", "Rp " + String.format("%,.2f", getGajiPokok())));
        System.out.println(String.format("%-30s: %s", "Tunjangan", "2,5% x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp. " + 
                          String.format("%,.2f", hitungTunjangan())));
    }
}
