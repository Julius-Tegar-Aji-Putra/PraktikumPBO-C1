/**
 * File       : Student.java
 * Deskripsi  : berisi atribut dan method dalam class Student
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 23 April 2025
 */

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public boolean isAsleep(int hr) { // override
        return 2 < hr || 8 > hr;
    }
}
