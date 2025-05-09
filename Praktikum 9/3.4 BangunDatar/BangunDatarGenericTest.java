/**
 * File     : BangunDatarGenericTest.java
 * Deskripsi: main class untuk generic bangun datar
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 07 Mei 2025
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg1 = new BangunDatarGeneric<Lingkaran>();
        Persegi p = new Persegi(2);
        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<Persegi>();
        Persegipanjang pp = new Persegipanjang(2, 3);
        BangunDatarGeneric<Persegipanjang> bdg3 = new BangunDatarGeneric<Persegipanjang>();
        Segitiga s = new Segitiga(2, 3, 4);
        BangunDatarGeneric<Segitiga> bdg4 = new BangunDatarGeneric<Segitiga>();

        bdg1.set(l);
        System.out.println("Tipe generic : " + bdg1.get().getClass().getName());
        System.out.println("Keliling lingkaran: " + bdg1.hitungKeliling());
        System.out.println("Luas lingkaran: " + bdg1.hitungLuas());

        bdg2.set(p);
        System.out.println("Tipe generic : " + bdg2.get().getClass().getName());
        System.out.println("Keliling persegi: " + bdg2.hitungKeliling());
        System.out.println("Luas persegi: " + bdg2.hitungLuas());

        bdg3.set(pp);
        System.out.println("Tipe generic : " + bdg3.get().getClass().getName());
        System.out.println("Keliling persegi panjang: " + bdg3.hitungKeliling());
        System.out.println("Luas persegi panjang: " + bdg3.hitungLuas());

        bdg4.set(s);
        System.out.println("Tipe generic : " + bdg4.get().getClass().getName());
        System.out.println("Keliling segitiga: " + bdg4.hitungKeliling());
        System.out.println("Luas segitiga: " + bdg4.hitungLuas());
    }
}
