/**
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Pembuat : Julius Tegar Aji Putra
 * Tanggal : 14 Mei 2025
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
