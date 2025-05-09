/**
 * File       : MAnabul.java
 * Deskripsi  : berisi Main driver untuk Anabul
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 08 Mei 2025
 */

public class MAnabul {
    public static void main(String[] args) {
        KoleksiAnabul KoleksiAnabul = new KoleksiAnabul(10);

        Anabul Anjing1 = new Anjing("Fur");
        Anabul Kucing1 = new Kucing("Hilmi");
        Anabul Burung1 = new Burung("Hawks");
        Anabul Anjing2 = new Anjing("Poppy");
        Anabul Kucing2 = new Kucing("Garvil");
        Anabul Burung2 = new Burung("Tweety");
        Anabul Anjing3 = new Anjing("Hobs");
        Anabul Kucing3 = new Kucing("Kitty");
        Anabul Burung3 = new Burung("Duck");
        Anabul KucingT = new Kucing("Tom");

        KoleksiAnabul.add(Anjing1);
        KoleksiAnabul.add(Kucing1);
        KoleksiAnabul.add(Burung1);
        KoleksiAnabul.add(Anjing2);
        KoleksiAnabul.add(Kucing2);
        KoleksiAnabul.add(Burung2);
        KoleksiAnabul.add(Anjing3);
        KoleksiAnabul.add(Kucing3);
        KoleksiAnabul.add(Burung3);
        KoleksiAnabul.add(KucingT);

        KoleksiAnabul.showAll();        
    }
}
