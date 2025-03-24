public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); // Tidak bisa karena BangunDatar abstract class
        BangunDatar P1 = new Persegi(10, "Merah", "Biru");
        System.out.println("Luas P1 : " + P1.getLuas());
        System.out.println("Keliling P1 : " + P1.getKeliling());
        // System.out.println("Diagonal P1 : " + P1.getDiagonal()); // Tidak bisa karena P1 adalah BangunDatar

        
        BangunDatar L1 = new Lingkaran(14, "Merah", "Ungu");
        System.out.println("Luas L1 : " + L1.getLuas());
        System.out.println("Keliling L1 : " + L1.getKeliling());

        Persegi P2 = new Persegi(5, "Hijau", "Kuning");
        System.out.println("Luas P2 : " + P2.getLuas());
        System.out.println("Keliling P2 : " + P2.getKeliling());
        System.out.println("Diagonal P2 : " + P2.getDiagonal());

        Lingkaran L2 = new Lingkaran(28, "Hijau", "Merah"); 
        System.out.println("Luas L2 : " + L2.getLuas());
        System.out.println("Keliling L2 : " + L2.getKeliling());
    
        System.out.println("Luas P1 == L1 : " + P1.isEqualLuas(L1));
        System.out.println("Keliling P1 == L1 : " + P1.isEqualKeliling (L1));

        // Jawaban pertanyaan
        // 1. method isEqualLuas dan isEqualKeliling dapat digunakan untuk membandingkan 
        // objek bangun datar yang berbeda
        // 2. Jika objek bangun datar tidak dijadikan class abstrak,
        // maka method isEqualLuas dan isEqualKeliling tidak dapat digunakan
        // karena method getLuas dan getKeliling tidak dapat diakses oleh objek bangun datar
        // karena method getLuas dan getKeliling hanya dapat diakses oleh class Persegi dan Lingkaran
        // namun jika ingin dipaksakan untuk objek bangun datar maka dapat menggunakan method getLuas dan getKeliling
        // dengan cara membuat default method getLuas dan getKeliling pada class BangunDatar
        // 3. Kelebihan saat class BangunDatar dijadikan abstrak adalah dapat digunakan untuk membuat objek bangun datar
        // adalah penggunaan yang lebih fleksibel karena kita juga bisa langsung
        // membandingkan objek bangun datar yang berbeda di class subclassnya hanya pada superclassnya
    
        System.out.println("Sisi P1 sebelum zoomIn : " + ((Persegi)P1).getSisi());
        ((Persegi)P1).zoomIn();
        System.out.println("Sisi P1 sesudah zoomIn : " + ((Persegi)P1).getSisi());
        // Perlu di casting karena P1 adalah BangunDatar tidak ada method zoomIn pada class BangunDatar


        System.out.println("Sisi P2 sebelum zoomOut : " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Sisi P2 sesudah zoomOut : " + P2.getSisi());
        
        System.out.println("Jari-jari L1 sebelum zoom 50%  : " + ((Lingkaran)L1).getJari());
        ((Lingkaran)L1).zoom(50);
        System.out.println("Jari-jari L1 sesudah zoom 50%  : " + ((Lingkaran)L1).getJari());
        // Perlu di casting karena L1 adalah BangunDatar tidak ada method zoom pada class BangunDatar

        System.out.println("Jari-jari L2 sebelum zoom 50%  : " + L2.getJari());
        L2.zoom(50);
        System.out.println("Jari-jari L2 sesudah zoom 50%  : " + L2.getJari());

        // Jawaban pertanyaan
        // 1. Interface itu bebas siapapun dapat memakai method zoomIn, zoomOut, dan zoom asalkan direalisasikan dalam classnya
        // 2. Keuntungan method zoomIn, zoomOut, dan zoom dikemas dalam interface IResize dibandingkan
        // dijadikan sebagai sebagai method dalam class BangunDatar
        // adalah penggunaan yang lebih fleksibel karena 3 method tersebut
        // dapat diakses langsung dimanapun asalkan di realisasikan
        // sedangkan di class abstract BangunDatar tidak dapat
    }
}
