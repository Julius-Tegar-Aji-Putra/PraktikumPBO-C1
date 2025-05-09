/** 
 * File       : KoleksiAnabul.java 
 * Deskripsi  : berisi implementasi koleksi Anabul
 * Pembuat    : Julius Tegar Aji Putra 
 * Tanggal    : 07 Mei 2025 
 */

public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;

    public KoleksiAnabul(int kapasitas) {
        this.koleksi = new Koleksi<Anabul>(kapasitas);
    }

    public void add(Anabul anabul) {
        this.koleksi.add(anabul);
    }

    public Anabul delete() {
        return this.koleksi.delete();
    }

    public void showAll() {
        System.out.println("Isi Koleksi Anabul :");
        for (int i = 1; i <= this.koleksi.getSize(); i++) {
            Anabul x = this.koleksi.getIsi(i-1);
            if (x != null) {
                System.out.println("Anabul ke-" + i);
                System.out.println("Tipe Generik : " + x.getClass().getName());
                System.out.println("Nama : " + x.getNama());
                x.Gerak();
                x.Bersuara();
                System.out.println();
            }
        }
    }
}
