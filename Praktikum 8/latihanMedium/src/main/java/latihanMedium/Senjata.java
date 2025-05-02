/**
 * File       : Senjata.java
 * Deskripsi  : berisi atribut dan method dalam class Senjata
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 30 April 2025
 */

package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public boolean isMenusuk() {
        return menusuk;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    } 
}

