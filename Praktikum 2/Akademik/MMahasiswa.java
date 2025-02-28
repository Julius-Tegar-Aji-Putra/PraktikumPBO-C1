/* Nama File   : MMahasiswa.java
 * Deskripsi   : berisi main driver untuk Mahasiswa
 * Pembuat     : Julius Tegar Aji Putra
 * Tanggal     : 19 Februari 2025
 */

import java.util.ArrayList;

public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen d1 = new Dosen("123", "Budi", "Informatika");
        Dosen d2 = new Dosen("456", "Santi", "Informatika");

        // Membuat objek MataKuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah ASA = new MataKuliah("ASA", "Algoritma dan Struktur Data", 3);
        MataKuliah RPL = new MataKuliah("RPL", "Rekayasa Perangkat Lunak", 3);
        MataKuliah SC = new MataKuliah("SC","Sistem Cerdas", 3); 
        MataKuliah PL = new MataKuliah("PL","Pemrograman Lanjut", 3);
        MataKuliah GKV = new MataKuliah("GKV","Grafika Komputer", 3);
        MataKuliah KRIPTO = new MataKuliah("KRIPTO","Kriptografi", 3);

        // Membuat objek Kendaraan
        Kendaraan k1 = new Kendaraan("B 1172 VKA", "Motor");
        Kendaraan k2 = new Kendaraan("H 6670 IR", "Mobil");

        // Membuat objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("117", "Aji", "Informatika");
        Mahasiswa m2 = new Mahasiswa("008", "Setiawan", "Informatika");

        // Menambahkan dosen wali pada mahasiswa
        m1.setDosenWali(d1);
        m2.setDosenWali(d2);

        // menginisiliasasi array matkul
        ArrayList<MataKuliah> List1 = new ArrayList<>();
        ArrayList<MataKuliah> List2 = new ArrayList<>();

        // Menambahkan Mata Kuliah pada mahasiswa
        m1.setListMatKul(List1);
        m2.setListMatKul(List2);

        // Menambahkan Mata Kuliah pada mahasiswa
        m1.addMatKul(PBO);
        m1.addMatKul(MBD);
        m1.addMatKul(ASA);
        m1.addMatKul(RPL);
        m2.addMatKul(KRIPTO);
        m2.addMatKul(GKV);
        m2.addMatKul(PL);
        m2.addMatKul(SC);
        m2.addMatKul(SC);

        // Menambahkan kendaraan pada mahasiswa
        m1.setKendaraan(k1);
        m2.setKendaraan(k2);

        // Menampilkan jumlah sks mahasiswa
        System.out.println("===== Jumlah SKS Mahasiswa =====");
        System.out.println("Jumlah SKS Mahasiswa 1: " + m1.getJumlahSKS());
        System.out.println("Jumlah SKS Mahasiswa 2: " + m2.getJumlahSKS());

        // Menampilkan jumlah matkul mahasiswa
        System.out.println("===== Jumlah Mata Kuliah Mahasiswa =====");
        System.out.println("Jumlah Mata Kuliah Mahasiswa 1: " + m1.getJumlahMatkul());
        System.out.println("Jumlah Mata Kuliah Mahasiswa 2: " + m2.getJumlahMatkul());

        // Menampilkan detail mahasiswa
        System.out.println("===== Detail Mahasiswa =====");
        m1.printDetailMhs();
        System.out.println();
        m2.printDetailMhs();



        








    }
}
