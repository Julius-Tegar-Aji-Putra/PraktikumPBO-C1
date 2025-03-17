/**
 * File       : Persegi.java
 * Deskripsi  : berisi atribut dan method dalam class Persegi
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
        // setWarna(warna);
        // setBorder(border); 
        // setJmlSisi(4);
    
        // Untuk mutator set dapat digantikan dengan Super(4,warna,border)
    }

    /* Jika menggunakan yang seperti ini :
    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
        }
     Penjelasan : tidak akan bisa karena jmlSisi, warna, dan border
     adalah atribut private dalam class BangunDatar yang hanya bisa diakses langsung
     di class BangunDatar saja, dan jika ingin mengubah maka harus
     menggunakan method public untuk mutatornya yang ada pada class BangunDatar
     untuk mengubahnya.
     */

    public double getSisi(){
        return this.sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return this.sisi * 4;
    }

    public double getDiagonal(){
        return Math.sqrt(2) * this.sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + this.sisi);
        System.out.println("Luas : " + this.getLuas());
        System.out.println("Keliling : " + this.getKeliling());
        System.out.println("Diagonal : " + this.getDiagonal());
    }

    // @Override
    // public static void printCounterBangunDatar(){
    //     System.out.println("Jumlah Objek Bangun Datar : " + counterBangunDatar);
    // }
    /* Hal diatas tidak dapat dilakukan karena method printCounterBangunDatar() adalah static */


    // Protected
    // public Persegi(double sisi, String warna, String border){
    //     this.jmlSisiProtected = 4;
    //     this.warnaProtected = warna;
    //     this.borderProtected = border;
    //     this.sisi = sisi;
    // }
    // Pada access modifier protected
    // atribut pada bangun datar dapat dapat diakses di class Persegi juga
    // karena class Persegi merupakan turunan dari class BangunDatar
    // yang sebelumnya provate tidak bisa diakses secara langsung 
    // saat menggunakan AP protected sudah bisa diakses langsung

    // final
    /* Ketika class BangunDatar ditambahkan keyword final maka class Persegi akan error, karena tiddak bisa diinherit */
    // Ketika pada method printInfo() pada class BangunDatar ditambahkan keyword final maka method printInfo() pada class Persegi akan error, karena tidak bisa diinherit

}
