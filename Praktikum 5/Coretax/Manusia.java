/**
 * File       : Manusia.java
 * Deskripsi  : berisi atribut dan method dalam class Manusia
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 21 Maret 2025
 */

public abstract class Manusia {
    protected String nama;
    protected date tgl_mulai_kerja; 
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tanggalString, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = convertToDate(tanggalString);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public Manusia(String nama, String tanggalString, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = convertToDate(tanggalString);
        this.alamat = "";
        this.pendapatan = pendapatan;
        counterMns++;
    }


    // Convert String to Date
    private date convertToDate(String tanggalString) {        
        // Format yang diharapkan: "DD-MM-YYYY"
        String[] parts = tanggalString.split("-");
        if (parts.length == 3) {
            int hari = Integer.parseInt(parts[0]);
            int bulanInt = Integer.parseInt(parts[1]);
            int tahun = Integer.parseInt(parts[2]);
            String bulanStr = date.strBulan(bulanInt);
            return new date(hari, bulanStr, tahun);
        } else {
            return new date(1, "Januari", 2025);
        }
    }

    public String getNama() {
        return this.nama;
    }

    public date getTgl_mulai_kerja() {
        return this.tgl_mulai_kerja;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(date tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setpendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Mulai Kerja: " + this.tgl_mulai_kerja);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("pendapatan: " + String.format("%,.0f", this.pendapatan));
    }

    public abstract int hitungMasaKerja();
}