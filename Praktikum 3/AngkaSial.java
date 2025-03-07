/**
 * File       : AngkaSial.java
 * Deskripsi  : Program penggunaan exception buatan sendiri
 *              Pengenalan klausul 'throw' dan 'throws'
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 7 Maret 2025
 */
 public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial"); // Baris 12
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13); // Ini akan men-trigger exception
            as.cobaAngka(12);
        } catch (AngkaSialException ase) { // Baris 21
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Jawaban Pertanyaan (sudah ditambah 2 line karena nama dan tanggal)
// 1. ketika eksepsi terjadi maka pada baris 12 tidak akan dieksekusi
// 2. baris ke 21 dimana terdapat line catch akan dieksekusi karena pada line 19 
//    terdapat eksepsi AngkaSialException yang ditangkap oleh line ini 
//    sehingga baris ini akan dieksekusi
