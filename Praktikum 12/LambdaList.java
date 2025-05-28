/**
 * File       : LambdaList.java
 * Deskripsi  : Implmentasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Mei 2025
 */

import java.util.*;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<String>();

        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((name) -> System.out.println(name));
    }    
}
