/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Julius Tegar Aji Putra
 * Tanggal     : 19 Februari 2025
 */

public class Titik {
    /* ATRIBUT */
    double absis, ordinat;
    static int counterTitik = 0;

    /* METHOD */
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        // this(0,0) juga dapat berjalan tetapi counterTitik bertambah 2x
        counterTitik++;
    }

    //konstruktor untuk membuat titik (x,y)
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mencetak nilai counterTitik
    void printCounterTitik() {
        System.out.println("Jumlah Objek Titik = " + Titik.counterTitik); // Telah dirubah karena menggunakan this tidak bisa untuk mengakses static
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }   

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        setAbsis(getAbsis() + x);
        setOrdinat(getOrdinat() + y);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + getAbsis() + "," + getOrdinat() + ")");
    }

    //mencari kuadran
    int getKuadran () {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    //mencari jarak ke pusat
    double getJarakPusat () {
        return Math.sqrt(getAbsis() * getAbsis() + getOrdinat() * getOrdinat());
    }
    
    //mencari jarak ke titik lain
    double getJarak (Titik T) {
        return Math.sqrt((T.getAbsis() - getAbsis()) * (T.getAbsis() - getAbsis()) + (T.getOrdinat() - getOrdinat()) * (T.getOrdinat() - getOrdinat()));
    }

    //refleksi X
    void refleksiX () {
        setOrdinat(-getOrdinat());
    }

    //refleksi Y
    void refleksiY () {
        setAbsis(-getAbsis());
    }

    // mengembalikan refleksi X
    Titik getRefleksiX () {
        return new Titik(getAbsis(), -getOrdinat());
    }

    // mengembalikan refleksi Y
    Titik getRefleksiY () {
        return new Titik(-getAbsis(), getOrdinat());
    }

} // end class Titik

