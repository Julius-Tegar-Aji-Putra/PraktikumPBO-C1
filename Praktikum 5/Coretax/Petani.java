/**
 * File       : Petani.java
 * Deskripsi  : berisi atribut dan method dalam class Petani
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 21 Maret 2025
 */

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tanggalString, String alamat, double pendapatan, String asal_kota) {
        super(nama, tanggalString, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_Kota() {
        return asal_kota;
    }

    public void setAsal_Kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
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
        // Digit ke 12 : 1
        int C = 1;
        return tahunSelisih + C;
    
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + this.asal_kota);
        System.out.println("Masa Kerja: " + this.hitungMasaKerja());
        System.out.println("Pajak: " + String.format("%,.0f", this.hitungPajak()));
    }
}
