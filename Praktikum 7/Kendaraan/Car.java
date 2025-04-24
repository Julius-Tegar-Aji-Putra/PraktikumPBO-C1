/**
 * File       : Car.java
 * Deskripsi  : berisi atribut dan method dalam class Car
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

public  class Car extends Vehicle{
    @Override
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = "+ fare);
    }

    @Override
    void sewa(){
        System.out.println("Sewa Mobil");
    }
}
