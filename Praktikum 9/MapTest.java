/**
 * File     : MapTest.java
 * Deskripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 07 Mei 2025
 */

 import java.util.*;

 public class MapTest {
     public static void main(String[] args) {
         // Kunci -> Integer, Nilai -> String
         Map<Integer, String> map = new HashMap<Integer, String>();
 
         // Menempatkan elemen kunci dan nilai
         map.put(1, "satu");
         map.put(2, "dua");
 
         // Mengambil elemen pertama
         System.out.println(map.get(1));
 
         // Mengambil keseluruhan kunci sebagai objek collection Set
         Set<Integer> key = map.keySet();
 
         // Jawaban Iterasi untuk mengambil seluruh nilai dari kunci
         for (Integer k : key) {
             System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
         }
     }
 }
 