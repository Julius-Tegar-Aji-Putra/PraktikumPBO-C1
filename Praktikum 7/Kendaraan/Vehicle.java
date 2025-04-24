/**
 * File       : Vehicle.java
 * Deskripsi  : berisi atribut dan method dalam class Vehicle
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("vehicle price = "+ fare);
    }

    void sewa(){
        System.out.println("Sewa Kendaraan");
    }
}
