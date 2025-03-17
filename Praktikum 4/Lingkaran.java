/**
 * File       : Lingkaran.java
 * Deskripsi  : berisi atribut dan method dalam class Persegi
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);  
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    public double getJari(){
        return this.jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * this.jari * this.jari;
    }

    public double getKeliling(){
        return Math.PI * this.jari * 2;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + this.jari);
        System.out.println("Luas : " + this.getLuas());
        System.out.println("Keliling : " + this.getKeliling());
    }

    // @Override
    // public static void printCounterBangunDatar(){
    //     System.out.println("Jumlah Objek Bangun Datar : " + counterBangunDatar);
    // }
    /* Hal diatas tidak dapat dilakukan karena method printCounterBangunDatar() adalah static */

    // final
    /* Ketika class BangunDatar ditambahkan keyword final maka class Lingkaran akan error, karena tiddak bisa diinherit */
    // Ketika pada method printInfo() pada class BangunDatar ditambahkan keyword final maka method printInfo() pada class Lingkaran akan error, karena tidak bisa diinherit
}