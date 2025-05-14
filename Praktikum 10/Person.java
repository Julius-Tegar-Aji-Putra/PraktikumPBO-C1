/**
 * File : Person.java
 * Deskripsi : Person database model
 * Pembuat : Julius Tegar Aji Putra
 * Tanggal : 14 Mei 2025
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}

