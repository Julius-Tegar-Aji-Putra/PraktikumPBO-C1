/**
 * File       : PNS.java
 * Deskripsi  : berisi atribut dan method dalam class PNS
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 21 Maret 2025
 */

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tanggalString, String alamat, double pendapatan, String nip) {
        super(nama, tanggalString, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tanggalString, double pendapatan, String nip) {
        super(nama, tanggalString, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
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
        // Digit ke 14 : 7
        int A = 7;
        return tahunSelisih + A;
    }

    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.1;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + this.nip);
        System.out.println("Masa Kerja: " + this.hitungMasaKerja());
        System.out.println("Pajak: " + String.format("%,.0f", this.hitungPajak()));
    }
}
