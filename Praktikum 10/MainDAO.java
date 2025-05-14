/**
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Pembuat : Julius Tegar Aji Putra
 * Tanggal : 14 Mei 2025
 */

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Vino");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
