/**
 * File       : TestPolimorfisme.java
 * Deskripsi  : berisi Main driver untuk Pegawai
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

import java.util.ArrayList; 

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        for (Pegawai p : emps) {
            p.tampilData();
        }
    }
}
