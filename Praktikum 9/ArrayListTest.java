/**
 * File     : ArrayListTest.java
 * Deskripsi: Program penggunaan objek ArrayList
 *            sebagai Collection class
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 07 Mei 2025
 */

 import java.util.ArrayList;

 public class ArrayListTest {
     public static void main(String[] args) {
         // Inisialisasi ArrayList yang hanya dapat berisi objek String
         ArrayList<String> strings = new ArrayList<String>();
 
         // Menambah elemen
         strings.add("praktikum");
         strings.add("collection");
         strings.add("dan generics");
 
         // Menghapus elemen
         strings.remove("praktikum");
        
         System.out.println(strings);
         // Iterasi pada keseluruhan ArrayList
         for (String s : strings) {
             System.out.print(s + " ");
         }
     }
 }
 