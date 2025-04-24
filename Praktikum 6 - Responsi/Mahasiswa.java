/**
 * File       : Mahasiswa.java
 * Deskripsi  : berisi atribut dan method dalam class Mahasiswa
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 28 Maret 2025
 */

public class Mahasiswa extends Civitasakademika{
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int counterMhs = 0;

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMhs++;
    }

    public String getNIM() {
        return this.NIM;
    }

    public int getSemester() {
        return this.semester;
    }

    public Fakultas getFakultas() {
        return this.fakultas;
    }

    public static int getCounterMhs() {
        return counterMhs;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        double UKTDisc = fakultas.getTarifUKT();

        for (int i = 1; i < semester; i++) {
            UKTDisc = UKTDisc * 0.95;
        }

        return UKTDisc;
    }

    @Override
    public void printInfo() {
        System.out.println("Mahasiswa:");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIM: " + NIM);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Tarif UKT: " + String.format("%.2f", hitungUKT()));
    }
}
