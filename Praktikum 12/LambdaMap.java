/**
 * File       : LambdaMap.java
 * Deskripsi  : Implmentasi lambda pada map, digunakan sebagai parameter pada method.
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Mei 2025
 */

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaList = new HashMap<String, String>();

        mahasiswaList.put("24060123130117","Adi");
        mahasiswaList.put("24060123130118","Bambang");
        mahasiswaList.put("24060123130119","Cici");
        mahasiswaList.put("24060123130120","Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nim,nama) -> {
            System.out.println(nim + " " + nama);
        });
    }    
}
