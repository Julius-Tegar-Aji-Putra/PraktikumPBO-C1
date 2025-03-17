/**
 * File       : Tanggal.java
 * Deskripsi  : berisi atribut dan method dalam class Tanggal
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class Tanggal {
    private int hari;
    private String bulan;
    private int tahun;

    public Tanggal(int hari, String bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getHari(){
        return this.hari;
    }

    public String getBulan(){
        return this.bulan;
    }

    public int getTahun(){
        return this.tahun;
    }
    
    public static int intBulan(String bulan){
        switch(bulan){
            case "Januari":
                return 1;
            case "Februari":
                return 2;
            case "Maret":
                return 3;
            case "April":
                return 4;
            case "Mei":
                return 5;
            case "Juni":
                return 6;
            case "Juli":
                return 7;
            case "Agustus":
                return 8;
            case "September":
                return 9;
            case "Oktober":
                return 10;
            case "November":
                return 11;
            case "Desember":
                return 12;
            default:
                return 0;
        }
    }

    public static String strBulan(int bulan) {
        switch(bulan) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                return "";
        }
    }

    public static int getJumlahHari(String bulan, int tahun) {
        int bulanint = intBulan(bulan);
        switch(bulanint) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if (tahun % 4 == 0 && tahun % 100 != 0 || tahun % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public static int getSelisihBulan(Tanggal T1, Tanggal T2){
        int bulan1 = intBulan(T1.getBulan());
        int bulan2 = intBulan(T2.getBulan());
        int tahun1 = T1.getTahun();
        int tahun2 = T2.getTahun();
        int selisih = (tahun2 - tahun1) * 12 + (bulan2 - bulan1);
        return selisih;
    }

    public static int[] getHitungMasa(Tanggal T1, Tanggal T2){
        int totalBulan = getSelisihBulan(T1, T2);
        if (T2.getHari() < T1.getHari()) {
            totalBulan -= 1;
        }
        int tahun = totalBulan / 12;
        int bulan = totalBulan % 12;
        return new int[] {tahun,bulan};
    }

    public Tanggal tambahTahun(int jumlahTahun) {
        return new Tanggal(this.hari, this.bulan, this.tahun + jumlahTahun);
    }

    public Tanggal TanggalSatuBulanBerikutnya() {
        int bulanInt = intBulan(this.bulan);
        int bulanBerikut = (bulanInt % 12) + 1;
        int tahunBerikut;
        if (bulanBerikut == 1){
            tahunBerikut = this.tahun + 1;
        }
        else {
            tahunBerikut = this.tahun;
        }
        return new Tanggal(1, strBulan(bulanBerikut), tahunBerikut);
    }

    @Override
    public String toString(){
        return this.hari + " " + this.bulan + " " + this.tahun;
    }
}