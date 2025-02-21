/* Nama File   : MGaris.java
 * Deskripsi   : berisi main driver untuk Garis
 * Pembuat     : Julius Tegar Aji Putra
 * Tanggal     : 19 Februari 2025
 */

public class MGaris {
    public static void main(String[] args){
        //Aplikasi Garis()
        System.out.println("===== Aplikasi Garis() =====");
        Garis Gorigin = new Garis();
        System.out.println("Garis Gorigin berada di titik awal (" + Gorigin.getTitikAwal().getAbsis() + "," + Gorigin.getTitikAwal().getOrdinat() + ")");

        //Aplikasi Garis(Titik TitikAwal, Titik TitikAkhir)
        System.out.println("===== Aplikasi Garis(Titik TitikAwal, Titik TitikAkhir) =====");
        Garis G1 = new Garis(new Titik(3, 4), new Titik(5, 6));
        System.out.println("Garis G1 berada di titik awal (" + G1.getTitikAwal().getAbsis() + "," + G1.getTitikAwal().getOrdinat() + ")");
        
        //Aplikasi getTitikAwal()
        System.out.println("===== Aplikasi getTitikAwal() =====");
        System.out.println("Titik awal G1 = (" + G1.getTitikAwal().getAbsis() + "," + G1.getTitikAwal().getOrdinat() + ")");

        //Aplikasi getTitikAkhir()
        System.out.println("===== Aplikasi getTitikAkhir() =====");
        System.out.println("Titik akhir G1 = (" + G1.getTitikAkhir().getAbsis() + "," + G1.getTitikAkhir().getOrdinat() + ")");
        
        //Aplikasi setTitikAwal()
        System.out.println("===== Aplikasi setTitikAwal() =====");
        G1.setTitikAwal(new Titik(7, 8));
        System.out.println("Titik awal G1 = (" + G1.getTitikAwal().getAbsis() + "," + G1.getTitikAwal().getOrdinat() + ")");
        
        //Aplikasi setTitikAkhir()
        System.out.println("===== Aplikasi setTitikAkhir() =====");
        G1.setTitikAkhir(new Titik(9, 10));
        System.out.println("Titik akhir G1 = (" + G1.getTitikAkhir().getAbsis() + "," + G1.getTitikAkhir().getOrdinat() + ")");

        //Aplikasi getCounterGaris()
        System.out.println("===== Aplikasi getCounterGaris() =====");
        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());

        //Aplikasi panjangGaris()
        System.out.println("===== Aplikasi panjangGaris() =====");
        System.out.println("Panjang Garis G1 = " + G1.getPanjang());

        //Aplikasi getGradien()
        System.out.println("===== Aplikasi getGradien() =====");
        System.out.println("Gradien Garis G1 = " + G1.getGradien());

        //Aplikasi getTitikTengah()
        System.out.println("===== Aplikasi getTitikTengah() =====");
        System.out.println("Titik Awal G1 = (" + G1.getTitikAwal().getAbsis() + "," + G1.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir G1 = (" + G1.getTitikAkhir().getAbsis() + "," + G1.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Titik tengah Garis G1 = (" + G1.getTitikTengah().getAbsis() + "," + G1.getTitikTengah().getOrdinat() + ")");

        //Aplikasi isSejajar()
        System.out.println("===== Aplikasi isSejajar() =====");
        Garis GS1 = new Garis(new Titik(3, 4), new Titik(5, 6));
        Garis GS2 = new Garis(new Titik(6,8), new Titik(10, 12));
        boolean sejajar = GS1.isSejajar(GS2);
        System.out.println("Apakah Garis G dan Garis GS2 sejajar? = " + sejajar);

        //Aplikasi isTegakLurus()
        System.out.println("===== Aplikasi isTegakLurus() =====");
        Garis GT1 = new Garis(new Titik(3, 4), new Titik(5, 6));
        Garis GT2 = new Garis(new Titik(6,8), new Titik(8, 6));
        boolean tegakLurus = GT1.isTegakLurus(GT2);
        System.out.println("Apakah Garis G dan Garis GT2 tegak lurus? = " + tegakLurus);

        //Aplikasi printGaris()
        System.out.println("===== Aplikasi printGaris() =====");
        GT1.printGaris();
    
        //Aplikasi bentukGaris()
        System.out.println("===== Aplikasi bentukGaris() =====");
        GT2.bentukGaris();
    }
}
