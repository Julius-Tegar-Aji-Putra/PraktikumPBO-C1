    /* Nama File   : Dosen.java
    * Deskripsi   : berisi atribut dan method dalam class Dosen
    * Pembuat     : Julius Tegar Aji Putra
    * Tanggal     : 26 Februari 2025
    */

    public class Dosen {
        /* ATRIBUT */
        private String NIP;
        private String Nama;
        private String Prodi;

        /* METHOD */
        //konstruktor untuk membuat dosen tanpa paramter
        public Dosen () {
            this.NIP = " ";
            this.Nama = " ";
            this.Prodi = " ";
        }

        //konstruktor untuk membuat dosen dengan parameter
        public Dosen (String NIP, String Nama, String Prodi) {
            this.NIP = NIP;
            this.Nama = Nama;
            this.Prodi = Prodi;
        }

        //mengembalikan nilai NIP
        public String getNIP() {
            return NIP;
        }

        //mengembalikan nilai Nama
        public String getNama() {
            return Nama;
        }

        //mengembalikan nilai Prodi
        public String getProdi() {
            return Prodi;
        }

        //mengeset NIP dengan parameter
        public void setNIP(String NIP) {
            this.NIP = NIP;
        }

        //mengeset Nama dengan parameter
        public void setNama(String Nama) {
            this.Nama = Nama;
        }

        //mengeset Prodi dengan parameter
        public void setProdi(String Prodi) {
            this.Prodi = Prodi;
        }
    }
