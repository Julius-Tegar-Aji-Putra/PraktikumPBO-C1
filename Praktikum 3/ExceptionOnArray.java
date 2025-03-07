/**
 * File       : ExceptionOnArray.java
 * Deskripsi  : Program penggunaan eksepsi menggunakan class library Java
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 7 Maret 2025
 */

 public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // Ini akan menghasilkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
