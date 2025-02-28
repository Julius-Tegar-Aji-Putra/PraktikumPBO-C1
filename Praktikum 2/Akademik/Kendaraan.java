    /* Nama File   : Kendaraan.java
    * Deskripsi   : berisi atribut dan method dalam class Kendaraan
    * Pembuat     : Julius Tegar Aji Putra
    * Tanggal     : 26 Februari 2025
    */

    public class Kendaraan {
        /* ATRIBUT */
        private String NoPlat;
        private String Jenis;

        /* METHOD */
        //konstruktor untuk membuat Kendaraan tanpa parameter
        public Kendaraan () {
            this.NoPlat = " ";
            this.Jenis = " ";
        }
    
        //konstruktor untuk membuat Kendaraan dengan parameter
        public Kendaraan (String NoPlat, String Jenis) {
            this.NoPlat = NoPlat;
            this.Jenis = Jenis;
        }
    
        //mengembalikan nilai NoPlat
        public String getNoPlat() {
            return NoPlat;
        }
    
        //mengembalikan nilai Jenis
        public String getJenis() {
            return Jenis;
        }
    
        //mengeset NoPlat dengan parameter
        public void setNoPlat(String NoPlat) {
            this.NoPlat = NoPlat;
        }
    
        //mengeset Jenis dengan parameter
        public void setJenis(String Jenis) {
            this.Jenis = Jenis;
        }
    }
    