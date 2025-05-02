/**
 * File       : Senjata.java
 * Deskripsi  : berisi atribut dan method dalam class Senjata
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 30 April 2025
 */

package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }
    public int getPeluru() {
        return peluru;
    }
    

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        int jumlah = this.getPeluru();
        if (jumlah > 0){
            System.out.print(getBunyi() + " ");
            jumlah--;
            setPeluru(jumlah);
            System.out.println("Sisa Peluru: "+ jumlah);
        }
        System.out.println();
    }
}
