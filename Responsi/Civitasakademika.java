/**
 * File       : Civitasakademika.java
 * Deskripsi  : berisi atribut dan method dalam class Civitasakademika
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Maret 2025
 */

public abstract class Civitasakademika {
    private String nama;
    private String email;

    public Civitasakademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return this.nama;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void printInfo();
}
