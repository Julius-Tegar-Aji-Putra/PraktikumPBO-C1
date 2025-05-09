/**
 * File     : BangunanDatarGeneric.java
 * Deskripsi: kelas konstruksi generic untuk BangunDatar
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 07 Mei 2025
 */

public class BangunDatarGeneric<T17 extends BangunDatar> {
    private T17 bangunDatar;

    public void set(T17 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T17 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}

// Jawaban
// Penggantian 'T' menjadi 'T17' hanya mengubah nama dari tipe generic