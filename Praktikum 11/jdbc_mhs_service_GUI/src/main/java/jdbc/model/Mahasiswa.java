/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * File : Mahasiswa.java
 * Deskripsi : Model mahasiswa
 * Pembuat : Julius Tegar Aji Putra
 * Tanggal : 27 Mei 2025
 */

package jdbc.model;

/**
 *
 * @author Julius Tegar
 */
public class Mahasiswa {
    // atribut
    private int id;
    private String nama;

    // Constructor tanpa parameter
    public Mahasiswa() {
        this.nama = "?";
    }

    // Constructor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}

