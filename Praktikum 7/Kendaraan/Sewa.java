/**
 * File       : Sewa.java
 * Deskripsi  : berisi atribut dan method dalam class Sewa
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bus = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bus.calRent(50, 1000);

        hitungSewa(kendaraan);
        hitungSewa(mobil);
        hitungSewa(bus);
    }
    static void hitungSewa(Vehicle x) {
        x.sewa();
    }   
}

