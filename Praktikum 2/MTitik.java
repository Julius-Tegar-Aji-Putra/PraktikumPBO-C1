/* Nama File   : MTitik.java
 * Deskripsi   : berisi main driver untuk Titik
 * Pembuat     : Julius Tegar Aji Putra
 * Tanggal     : 19 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        // Aplikasi Titik()
        System.out.println("===== Aplikasi Titik() =====");
        Titik T1 = new Titik();
        System.out.println("Titik T1 berada di koordinat (" + T1.getAbsis() + "," + T1.getOrdinat() + ")");

        //Aplikasi Titik(int absis, int ordinat)
        System.out.println("===== Aplikasi Titik(int absis, int ordinat) =====");
        Titik T2 = new Titik(3, 4);
        System.out.println("Titik T2 berada di koordinat (" + T2.getAbsis() + "," + T2.getOrdinat() + ")");

        //Aplikasi getCounterTitik()
        System.out.println("===== Aplikasi getCounterTitik() =====");
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        //Aplikasi printCounterTitik()
        System.out.println("===== Aplikasi printCounterTitik() =====");
        T2.printCounterTitik();

        //Aplikasi getAbsis()
        System.out.println("===== Aplikasi getAbsis() =====");
        System.out.println("Absis T2 = " + T2.getAbsis());

        //Aplikasi getOrdinat()
        System.out.println("===== Aplikasi getOrdinat() =====");
        System.out.println("Ordinat T2 = " + T2.getOrdinat());

        //Aplikasi setAbsis()
        System.out.println("===== Aplikasi setAbsis() =====");
        T1.setAbsis(5);
        System.out.println("Absis T1 = " + T1.getAbsis());

        //Aplikasi setOrdinat()
        System.out.println("===== Aplikasi setOrdinat() =====");
        T1.setOrdinat(6);
        System.out.println("Ordinat T1 = " + T1.getOrdinat());

        //Aplikasi geser()
        System.out.println("===== Aplikasi geser() =====");
        System.out.println("Titik T1 berada di koordinat (" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
        T1.geser(2, 3);
        System.out.println("Titik T1 digeser sejauh (2,3)");
        System.out.println("Titik T1 berada di koordinat (" + T1.getAbsis() + "," + T1.getOrdinat() + ")");

        //Aplikasi printTitik()
        System.out.println("===== Aplikasi printTitik() =====");
        T1.printTitik();
        T2.printTitik();

        //Aplikasi getKuadran()
        System.out.println("===== Aplikasi getKuadran() =====");
        System.out.println("Kuadran T1 = " + T1.getKuadran());
        System.out.println("Kuadran T2 = " + T2.getKuadran());

        //Aplikasi getJarakPusat()
        System.out.println("===== Aplikasi getJarakPusat() =====");
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("Jarak T2 ke pusat = " + T2.getJarakPusat());

        //Aplikasi getJarak()
        System.out.println("===== Aplikasi getJarak() =====");
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));

        //Aplikasi refleksiX()
        System.out.println("===== Aplikasi refleksiX() =====");
        System.out.println("Sebelum di refleksi sumbu X  : ");
        T2.printTitik();
        T2.refleksiX();
        System.out.println("Setelah di refleksi sumbu X : ");
        T2.printTitik();

        //Aplikasi refleksiY()
        System.out.println("===== Aplikasi refleksiY() =====");
        System.out.println("Sebelum di refleksi sumbu Y  : ");
        T2.printTitik();
        T2.refleksiY();
        System.out.println("Setelah di refleksi sumbu Y : ");
        T2.printTitik();

        //Aplikasi getRefleksiX()
        System.out.println("===== Aplikasi getRefleksiX() =====");
        System.out.println("Titik T2 berada di koordinat (" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
        Titik T3 = new Titik();
        T3 = T2.getRefleksiX();
        System.out.println("Titik T3 hasil refleksi sumbu X berada di koordinat (" + T3.getAbsis() + "," + T3.getOrdinat() + ")");

        //Aplikasi getRefleksiY()
        System.out.println("===== Aplikasi getRefleksiY() =====");  
        System.out.println("Titik T2 berada di koordinat (" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
        Titik T4 = new Titik();
        T4 = T2.getRefleksiY();
        System.out.println("Titik T4 hasil refleksi sumbu Y berada di koordinat (" + T4.getAbsis() + "," + T4.getOrdinat() + ")");
        

        System.out.println("==== Pembuktian menyamakan reference Test1 dan Test2 ====");
        Titik Test1 = new Titik(1,1);
        Test1.setAbsis(5);
        Test1.setOrdinat(5);
        System.out.println("Titik Test1 berada di koordinat (" + Test1.getAbsis() + "," + Test1.getOrdinat() + ")");

        Titik Test2 = new Titik();
        Test2 = Test1;
        System.out.println("Titik Test2 berada di koordinat (" + Test2.getAbsis() + "," + Test2.getOrdinat() + ")");

        System.out.println("Mengubah Titik Test2 menjadi (10,10)");
        Test2.setAbsis(10);
        Test2.setOrdinat(10);

        System.out.println("Titik Test2 berada di koordinat (" + Test2.getAbsis() + "," + Test2.getOrdinat() + ")");

        System.out.println("Titik Test1 berada di koordinat (" + Test1.getAbsis() + "," + Test1.getOrdinat() + ")");

        // T1 ikut berubah karena reference T1 dan T2 sama, maka dari itu ketika T2 diubah maka T1 ikut berubah

        // Pembuktian efek penambahan access modifier pada class Titik
        System.out.println("==== Pembuktian efek penambahan access modifier pada class Titik ====");
        // sebelum penambahan masih bisa seperti ini
        Titik TestT = new Titik();
        // TestT.absis = 5;
        // TestT.ordinat = 5;
        // System.out.println("Titik TestT berada di koordinat (" + TestT.absis + "," + TestT.ordinat + ")");
        // akan menghasilkan error bahwa absis dan ordinat tidak dapat diakses karena private

        // sesudah penambahan
        TestT.setAbsis(5);
        TestT.setOrdinat(5);
        System.out.println("Titik TestT berada di koordinat (" + TestT.getAbsis() + "," + TestT.getOrdinat() + ")");
        // hal ini bisa dilakukan karena setAbsis dan setOrdinat mempunyai akses public

        // bereksperimen terhadap access modifier dengan mengcopy method menjadi private 
        // System.out.println("Kuadran titik TestT = " + TestT.getKuadranPrivate());
        // terjadi error karena getKuadranPrivate mempunyai access modifier private



    }

    

}