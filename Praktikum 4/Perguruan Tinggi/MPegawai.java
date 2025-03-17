/**
 * File       : Mpegawai.java
 * Deskripsi  : berisi main driver untuk Pegawai
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 14 Maret 2025
 */

public class MPegawai {
    public static void main(String[] args) {
        Tanggal tglLahirAndi = new Tanggal(5, "Mei", 1990);
        Tanggal tmtAndi = new Tanggal(1, "Januari", 2015);
        
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", tglLahirAndi, tmtAndi, 5000000.0, 
                                               "Fakultas Sains dan Matematika", "78647324");
        
        System.out.println("=== Contoh Dosen Tetap ===");
        dosenTetap.printInfo();
        
        System.out.println("\n=== Contoh Dosen Tamu ===");
        Tanggal tglLahirBudi = new Tanggal(15, "Juni", 1985);
        Tanggal tmtBudi = new Tanggal(1, "Februari", 2020);
        Tanggal kontrakBudi = new Tanggal(31, "Desember", 2025);
        
        DosenTamu dosenTamu = new DosenTamu("8675432109", "Budi", tglLahirBudi, tmtBudi, 6000000.0, 
                                           "Fakultas Ekonomi dan Bisnis", "DT12345", kontrakBudi);
        dosenTamu.printInfo();
        
        System.out.println("\n=== Contoh Tendik ===");
        Tanggal tglLahirCici = new Tanggal(22, "Agustus", 1992);
        Tanggal tmtCici = new Tanggal(15, "Juli", 2018);
        
        Tendik tendik = new Tendik("7890123456", "Cici", tglLahirCici, tmtCici, 4500000.0, "Akademik");
        tendik.printInfo();
    }
}
