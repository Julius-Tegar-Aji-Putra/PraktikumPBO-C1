import java.sql.*;

/**
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 * Pembuat : Julius Tegar Aji Putra
 * Tanggal : 14 Mei 2025
 */

 public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
        // membuat koneksi, nama db, user, password menyesuaikan
        // Class.forName("com.mysql.jdbc.Driver"); // Dihilangkan karena membuat error {menggunakan MySQL Workbench}
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo", 
            "root", 
            "MLPUBG123"
        );
        
        // kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // tutup koneksi database
        con.close();
    }
}

// cara running program
// javac *.java
// java -cp ".;mysql-connector-j-9.3.0.jar" MainDAO