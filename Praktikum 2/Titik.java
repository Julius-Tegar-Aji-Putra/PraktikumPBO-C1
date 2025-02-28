/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Julius Tegar Aji Putra
 * Tanggal     : 19 Februari 2025
 */

public class Titik {
    /* ATRIBUT */
    private double absis; 
    private double ordinat;
    private static int counterTitik = 0;

    /* METHOD */
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        // this(0,0) juga dapat berjalan tetapi counterTitik bertambah 2x
        counterTitik++;
    }

    //konstruktor untuk membuat titik (x,y)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    //mencetak nilai counterTitik
    public void printCounterTitik() {
        System.out.println("Jumlah Objek Titik = " + Titik.counterTitik); // Telah dirubah karena menggunakan this tidak bisa untuk mengakses static
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }   

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        setAbsis(getAbsis() + x);
        setOrdinat(getOrdinat() + y);
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + getAbsis() + "," + getOrdinat() + ")");
    }

    //mencari kuadran
    public int getKuadran () {
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
    public double getJarakPusat () {
        return Math.sqrt(getAbsis() * getAbsis() + getOrdinat() * getOrdinat());
    }
    
    //mencari jarak ke titik lain
    public double getJarak (Titik T) {
        return Math.sqrt((T.getAbsis() - getAbsis()) * (T.getAbsis() - getAbsis()) + (T.getOrdinat() - getOrdinat()) * (T.getOrdinat() - getOrdinat()));
    }

    //refleksi X
    public void refleksiX () {
        setOrdinat(-getOrdinat());
    }

    //refleksi Y
    public void refleksiY () {
        setAbsis(-getAbsis());
    }

    // mengembalikan refleksi X
    public Titik getRefleksiX () {
        return new Titik(getAbsis(), -getOrdinat());
    }

    // mengembalikan refleksi Y
    public Titik getRefleksiY () {
        return new Titik(-getAbsis(), getOrdinat());
    }

    // //mencari kuadran
    // private int getKuadranPrivate () {
    //     if (getAbsis() > 0 && getOrdinat() > 0) {
    //         return 1;
    //     } else if (getAbsis() < 0 && getOrdinat() > 0) {
    //         return 2;
    //     } else if (getAbsis() < 0 && getOrdinat() < 0) {
    //         return 3;
    //     } else {
    //         return 4;
    //     }
    // }
    

} // end class Titik

