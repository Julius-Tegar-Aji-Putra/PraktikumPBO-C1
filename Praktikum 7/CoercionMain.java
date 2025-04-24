/**
 * File       : CoercionMain.java
 * Deskripsi  : berisi Main driver untuk Coercion
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

public class CoercionMain {
    public static void main(String[] args) {

        // Contoh 1: Konversi dari char ke int (tidak casting)
        // int output = 'a';
        // System.out.println(output);

        // Contoh 2: Konversi dari double ke int (perlu casting)
        // double x = 15.5;
        // int output =  (int) x; // Diberikan casting int 
        // System.out.println(output);

        // Contoh 3: Konversi dari int ke double (otomatis)
        // int y = 25;
        // double output = y;
        // System.out.println(output);

        // Contoh 4: Konversi dari int ke char (perlu casting)
        // int z = 78;
        // char output = (char) z;
        // System.out.println(output);

        // Contoh 5: Konversi dari char ke double (otomatis)
        char a = 'a';
        double output = a;
        System.out.println(output);
    }
}
