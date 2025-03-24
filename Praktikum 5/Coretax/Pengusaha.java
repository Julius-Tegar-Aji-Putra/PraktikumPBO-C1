/**
 * File       : Pengusaha.java
 * Deskripsi  : berisi atribut dan method dalam class Pengusaha
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 21 Maret 2025
 */

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tanggalString, String alamat, double pendapatan, String npwp) {
        super(nama, tanggalString, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        date now = new date(21, "Maret", 2025); // Asumsi now adalah 21 Maret 2025
        int tahunSelisih = now.getTahun() - this.getTgl_mulai_kerja().getTahun();
        
        if (date.intBulan(now.getBulan()) < date.intBulan(this.getTgl_mulai_kerja().getBulan()) ||
            (date.intBulan(now.getBulan()) == date.intBulan(this.getTgl_mulai_kerja().getBulan()) && 
             now.getHari() < this.getTgl_mulai_kerja().getHari())) {
            tahunSelisih--;
        }
        
        // NIM : 24060123130117
        // Digit ke 13 : 1
        int B = 1;
        return tahunSelisih + B;
    }

    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.15;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + this.npwp);
        System.out.println("Masa Kerja: " + this.hitungMasaKerja());
        System.out.println("Pajak: " + String.format("%,.0f", this.hitungPajak()));
    }
}
