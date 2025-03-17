/**
 * File       : BangunDatar.java
 * Deskripsi  : berisi atribut dan method dalam class BangunDatar
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;
    // protected int jmlSisiProtected;
    // protected String warnaProtected;
    // protected String borderProtected;

    public BangunDatar(){
        this.jmlSisi = 0;
        this.warna = " ";
        this.border = " ";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar : " + counterBangunDatar);
    }

    public int getJmlSisi(){
        return this.jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return this.warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return this.border;
    }
    
    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi : " + this.jmlSisi);
        System.out.println("Warna : " + this.warna);
        System.out.println("Border : " + this.border);
    }
}