/**
 * File     : Main.java
 * Deskripsi: berisi driver untuk class Koleksi
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 07 Mei 2025
 */

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>(10);
        Character output;
        // add
        koleksiChar.add('A');
        koleksiChar.add('B');
        koleksiChar.add('C');
        koleksiChar.add('D');
        koleksiChar.add('E');
        koleksiChar.add('F');
        koleksiChar.add('G');
        koleksiChar.add('H');
        koleksiChar.add('I');
        koleksiChar.add('J');
        
        // showAll
        System.out.println("=== showAll ===");
        koleksiChar.showAll();

        // getIsi
        System.out.println("\n=== getIsi index 5 ===");
        System.out.println("Isi index 5: " + koleksiChar.getIsi(5));

        // setIsi
        System.out.println("=== setIsi 'K' index 5 ===");
        koleksiChar.setIsi('K', 5);
        System.out.println("Isi index 5: " + koleksiChar.getIsi(5));

        // getSize
        System.out.println("=== getSize ===");
        System.out.println("Jumlah elemen: " + koleksiChar.getSize());

        // setSize
        System.out.println("=== setSize 9 ===");
        koleksiChar.setSize(9);
        System.out.println("Jumlah elemen: " + koleksiChar.getSize());

        // delete
        System.out.println("=== delete ===");
        System.out.println("Sebelum dihapus: ");
        koleksiChar.showAll();
        output = koleksiChar.delete();
        System.out.println("\nElemen yang dihapus: " + output);
        System.out.println("Setelah dihapus: ");
        koleksiChar.showAll();
        
    }
}
