/**
 * File       : DosenTetap.java
 * Deskripsi  : berisi atribut dan method dalam class DosenTetap
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class DosenTetap extends Dosen {
    private String NIDN;
    private static final int BUP = 65;

    public DosenTetap(String NIP, String Nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String Fakultas, String NIDN) {
        super(NIP, Nama, tanggalLahir, TMT, gajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public Tanggal hitungBUP(){
        Tanggal tanggalBUP = getTanggalLahir().tambahTahun(BUP);
        return tanggalBUP.TanggalSatuBulanBerikutnya();
    }

    public double hitungTunjangan(){
        return 0.02 * getMasaKerjaTahun() * getGajiPokok();
    }

    @Override
    public void printInfo(){
        System.out.println(String.format("%-30s: %s", "NIP", getNIP()));
        System.out.println(String.format("%-30s: %s", "NIDN", this.NIDN));
        System.out.println(String.format("%-30s: %s", "Nama", getNama()));
        System.out.println(String.format("%-30s: %s", "Tanggal Lahir", getTanggalLahir()));
        System.out.println(String.format("%-30s: %s", "TMT", getTMT()));
        System.out.println(String.format("%-30s: %s", "Jabatan", "Dosen Tetap"));
        System.out.println(String.format("%-30s: %s", "Fakultas", getFakultas()));
        System.out.println(String.format("%-30s: %s", "Masa Kerja", getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan"));
        System.out.println(String.format("%-30s: %s", "BUP", this.hitungBUP()));
        System.out.println(String.format("%-30s: %s", "Gaji Pokok", "Rp " + String.format("%,.2f", getGajiPokok())));
        System.out.println(String.format("%-30s: %s", "Tunjangan", "2% x " + getMasaKerjaTahun() + " x Rp " + 
                          String.format("%,.2f", getGajiPokok()) + " = Rp. " + 
                          String.format("%,.2f", hitungTunjangan())));
    }
}
