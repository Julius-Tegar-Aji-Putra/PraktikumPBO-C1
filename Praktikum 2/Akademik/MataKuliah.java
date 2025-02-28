    /* Nama File   : MataKuliah.java
    * Deskripsi   : berisi atribut dan method dalam class MataKuliah
    * Pembuat     : Julius Tegar Aji Putra
    * Tanggal     : 26 Februari 2025
    */

    public class MataKuliah {
        /* ATRIBUT */
        private String idMatKul;
        private String Nama;
        private int Sks;
    
        /* METHOD */
        //konstruktor untuk membuat matakuliah tanpa parameter
        public MataKuliah () {
            this.idMatKul = " ";
            this.Nama = " ";
            this.Sks = 0;
        }
    
        //konstruktor untuk membuat matakuliah dengan parameter
        public MataKuliah (String idMatKul, String Nama, int Sks) {
            this.idMatKul = idMatKul;
            this.Nama = Nama;
            this.Sks = Sks;
        }
    
        //mengembalikan nilai idMatKul
        public String getIdMatKul() {
            return idMatKul;
        }
    
        //mengembalikan nilai Nama
        public String getNama() {
            return Nama;
        }
    
        //mengembalikan nilai Sks
        public int getSks() {
            return Sks;
        }
    
        //mengeset idMatKul dengan parameter
        public void setIdMatKul(String idMatKul) {
            this.idMatKul = idMatKul;
        }

        //mengeset Nama dengan parameter
        public void setNama(String Nama) {
            this.Nama = Nama;
        }
    
        //mengeset Sks dengan parameter
        public void setSks(int Sks) {
            this.Sks = Sks;
        }
    }
    