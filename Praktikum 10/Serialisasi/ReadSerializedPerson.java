/**
 * File : ReadSerializedPerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Pembuat : Julius Tegar Aji Putra
 * Tanggal : 14 Mei 2025
 */

 import java.io.*;

 // Pastikan class Person sudah didefinisikan sebelumnya dan implement Serializable
 
 public class ReadSerializedPerson {
     public static void main(String[] args) {
         Person person = null;
         try {
             FileInputStream f = new FileInputStream("person.ser");
             ObjectInputStream s = new ObjectInputStream(f);
             person = (Person) s.readObject();
             s.close();
             System.out.println("serialized person name = " + person.getName());
         } catch (Exception ioe) {
             ioe.printStackTrace();
         }
     }
 }
 