/**
 * File       : DiskonLambda.java
 * Deskripsi  : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Mei 2025
 */
interface IDiskon {
    public double hitungDiskon(double harga);
}


public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(double harga) {
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka = " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran = " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa = " + diskonBiasa.hitungDiskon(45000));
    }
}

// Perbedaan ketiga implementasi Diskon
/*
 * diskon merdeka menggunakan konsep anonymous class
 * yang berarti menggunakan class dengan nama (interface) IDiskon
 * dan dapat dipakai berulang kali
 * sedangkan diskon lebaran dan diskon biasa menggunakan lambda
 * yang berarti hanya dapat dipakai sekali dan berbentuk
 * fungsi anonymous dan tidak dimiliki oleh semua class
 * dan untuk perbedaan diskonLebaran dan diskonBiasa
 * diskonBiasa menggunakan blok statement sedangkan 
 * diskonLebaran tidak menggunakan blok statement dan hanya satu baris saja
 */