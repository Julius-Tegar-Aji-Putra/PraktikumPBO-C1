/* Nama File   : BangunDatar.java
 * Deskripsi   : berisi main driver untuk BangunDatar
 * Pembuat     : Julius Tegar Aji Putra
 * Tanggal     : 14 Maret 2025
 */

public class MBangunDatar {
    public static void main(String[] args) {
        //Aplikasi BangunDatar()
        System.out.println("===== Aplikasi BangunDatar() =====");
        BangunDatar Borigin = new BangunDatar();
        System.out.println("BangunDatar Borigin memiliki jumlah sisi " + Borigin.getJmlSisi() + ", warna " + Borigin.getWarna() + ", dan border " + Borigin.getBorder());

        //Aplikasi BangunDatar(int jmlSisi, String warna, String border)
        System.out.println("===== Aplikasi BangunDatar(int jmlSisi, String warna, String border) =====");
        BangunDatar B1 = new BangunDatar(4, "Merah", "Biru");
        System.out.println("BangunDatar B1 memiliki jumlah sisi " + B1.getJmlSisi() + ", warna " + B1.getWarna() + ", dan border " + B1.getBorder());

        //Aplikasi printCounterBangunDatar()
        System.out.println("===== Aplikasi printCounterBangunDatar() =====");
        BangunDatar.printCounterBangunDatar();

        //Aplikasi getJmlSisi()
        System.out.println("===== Aplikasi getJmlSisi() =====");
        System.out.println("Jumlah Sisi B1 = " + B1.getJmlSisi());

        //Aplikasi setJmlSisi(int jmlSisi)
        System.out.println("===== Aplikasi setJmlSisi(int jmlSisi) =====");
        B1.setJmlSisi(5);
        System.out.println("Jumlah Sisi B1 = " + B1.getJmlSisi());

        //Aplikasi getWarna()
        System.out.println("===== Aplikasi getWarna() =====");
        System.out.println("Warna B1 = " + B1.getWarna());

        //Aplikasi setWarna(String warna)
        System.out.println("===== Aplikasi setWarna(String warna) =====");
        B1.setWarna("Hijau");
        System.out.println("Warna B1 = " + B1.getWarna());

        //Aplikasi getBorder()
        System.out.println("===== Aplikasi getBorder() =====");
        System.out.println("Border B1 = " + B1.getBorder());

        //Aplikasi setBorder(String border)
        System.out.println("===== Aplikasi setBorder(String border) =====");
        B1.setBorder("Kuning");
        System.out.println("Border B1 = " + B1.getBorder());

        //Aplikasi printInfo()
        System.out.println("===== Aplikasi printInfo() =====");
        B1.printInfo();

        //Aplikasi Persegi()
        System.out.println("===== Aplikasi Persegi() =====");
        Persegi Porigin = new Persegi();
        System.out.println("Persegi Porigin memiliki sisi " + Porigin.getJmlSisi());

        //Aplikasi Persegi(double sisi, String warna, String border)
        System.out.println("===== Aplikasi Persegi(double sisi, String warna, String border) =====");
        Persegi P1 = new Persegi(5, "Merah", "Biru");
        System.out.println("Persegi P1 memiliki sisi " + P1.getSisi() + ", warna " + P1.getWarna() + ", dan border " + P1.getBorder());

        //Aplikasi getSisi()
        System.out.println("===== Aplikasi getSisi() =====");
        System.out.println("Sisi P1 = " + P1.getSisi());

        //Aplikasi setSisi(double sisi)
        System.out.println("===== Aplikasi setSisi(double sisi) =====");
        P1.setSisi(6);
        System.out.println("Sisi P1 = " + P1.getSisi());

        //Aplikasi getLuas()
        System.out.println("===== Aplikasi getLuas() =====");
        System.out.println("Luas P1 = " + P1.getLuas());

        //Aplikasi getKeliling()
        System.out.println("===== Aplikasi getKeliling() =====");
        System.out.println("Keliling P1 = " + P1.getKeliling());

        //Aplikasi getDiagonal()
        System.out.println("===== Aplikasi getDiagonal() =====");
        System.out.println("Diagonal P1 = " + P1.getDiagonal());

        //Aplikasi printInfo()
        System.out.println("===== Aplikasi printInfo() =====");
        P1.printInfo();

        //Aplikasi Lingkaran()
        System.out.println("===== Aplikasi Lingkaran() =====");
        Lingkaran Lorigin = new Lingkaran();
        System.out.println("Lingkaran Lorigin memiliki sisi " + Lorigin.getJmlSisi());

        //Aplikasi Lingkaran(double diameter, String warna, String border)
        System.out.println("===== Aplikasi Lingkaran(double diameter, String warna, String border) =====");
        Lingkaran L1 = new Lingkaran(14, "Merah", "Biru");
        System.out.println("Lingkaran L1 memiliki jari-jari " + L1.getJari() + ", warna " + L1.getWarna() + ", dan border " + L1.getBorder());
        
        //Aplikasi getJari()
        System.out.println("===== Aplikasi getJari() =====");
        System.out.println("Jari-jari L1 = " + L1.getJari());

        //Aplikasi setJari(double jari)
        System.out.println("===== Aplikasi setJari(double jari) =====");
        L1.setJari(21);
        System.out.println("Jari-jari L1 = " + L1.getJari());

        //Aplikasi getLuas()
        System.out.println("===== Aplikasi getLuas() =====");
        System.out.println("Luas L1 = " + L1.getLuas());

        //Aplikasi getKeliling()
        System.out.println("===== Aplikasi getKeliling() =====");
        System.out.println("Keliling L1 = " + L1.getKeliling());

        //Aplikasi printInfo()
        System.out.println("===== Aplikasi printInfo() =====");
        L1.printInfo();
    }
}

