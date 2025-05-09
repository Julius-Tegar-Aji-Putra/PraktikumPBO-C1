/**
 * File     : Koleksi.java
 * Deskripsi: berisi atribut dan method dalam class Koleksi
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 07 Mei 2025
 */

public class Koleksi <G> {
    private G[] wadah;
    private int nbelm;

    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        this.wadah = (G[]) new Object[kapasitas];
        this.nbelm = 0;
    }

    public G getIsi(int indeks) {
        return this.wadah[indeks];
    }

    public void setIsi(G elemen, int indeks) {
        this.wadah[indeks] = elemen;
    }

    public int getSize() {
        return this.nbelm;
    }

    public void setSize(int nbelm) {
        this.nbelm = nbelm;
    }

    public void add(G elemen) {
        this.wadah[this.nbelm] = elemen;
        this.nbelm++;
    }

    public G delete(){
        // Kamus lokal
        G elemen;
        // Algoritma
        if (this.nbelm == 0) {
            System.out.println("Koleksi kosong");
            return null;
        } else {
            elemen = this.wadah[this.nbelm - 1];
            this.wadah[this.nbelm - 1] = null;
            this.nbelm--;
            return elemen;
        }
    }
    
    public void showAll() {
        System.out.print("Isi koleksi: ");
        for (int i = 0; i < this.nbelm; i++) {
            System.out.print(this.wadah[i] + " ");
        }
    }
}
