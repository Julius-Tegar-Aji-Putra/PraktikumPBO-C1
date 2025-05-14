/**
 * File       : MCivitasakademika.java
 * Deskripsi  : berisi main driver dari sebuah sistem dalam Universitas
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Maret 2025
 */

public class MCivitasakademika {
    public static void main(String[] args) {
        Fakultas ft = new Fakultas("Fakultas Teknik", 12000000.0, 8000000.0);
        Fakultas fsm = new Fakultas("Fakultas Sains dan Matematika", 10000000.0, 7500000.0);
        
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "budi@gmail.com", "24060123130117", 1, ft);
        Mahasiswa mhs2 = new Mahasiswa("Ani Wijaya", "ani@gmail.com", "24060123130118", 5, fsm);
        
        Dosen dosen1 = new Dosen("Dr. Ahmad", "ahmad@gmail.com", "19284652781927", 10, ft);
        Dosen dosen2 = new Dosen("Prof. Siti", "siti@gmail.com", "19284652781928", 15, fsm);
        
        Tendik tendik1 = new Tendik("Joko", "joko@gmail.com", "19284652781929", 5);
        Tendik tendik2 = new Tendik("Rina", "rina@gmail.com", "19284652781920", 8);
        
        mhs1.printInfo();
        System.out.println();
        mhs2.printInfo();
        System.out.println();
        
        dosen1.printInfo();
        System.out.println();
        dosen2.printInfo();
        System.out.println();
        
        tendik1.printInfo();
        System.out.println();
        tendik2.printInfo();
        System.out.println();
        
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getCounterMhs());
        System.out.println("Jumlah Dosen: " + Dosen.getCounterDosen());
        System.out.println("Jumlah Tendik: " + Tendik.getCounterTendik());
    }
}
