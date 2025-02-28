    /* Nama File   : Mahasiswa.java
    * Deskripsi   : berisi atribut dan method dalam class Mahasiswa
    * Pembuat     : Julius Tegar Aji Putra
    * Tanggal     : 26 Februari 2025
    */

    import java.util.ArrayList;

    public class Mahasiswa {
        /* ATRIBUT */
        private String Nim;
        private String Nama;
        private String Prodi;
        ArrayList<MataKuliah> listMatKul;
        private Dosen dosenWali;
        private Kendaraan kendaraan;

        /* METHOD */
        //konstruktor untuk membuat Mahasiswa tanpa parameter
        public Mahasiswa () {
            this.Nim = " ";
            this.Nama = " ";
            this.Prodi = " ";
            this.listMatKul = new ArrayList<>();
            this.dosenWali = new Dosen();
            this.kendaraan = new Kendaraan();
        }
    
        //konstruktor untuk membuat Mahasiswa dengan parameter
        public Mahasiswa (String Nim, String Nama, String Prodi) {
            this.Nim = Nim;
            this.Nama = Nama;
            this.Prodi = Prodi;
        }

        //mengembalikan nilai Nim
        public String getNim() {
            return Nim;
        }
    
        //mengembalikan nilai Nama
        public String getNama() {
            return Nama;
        }
    
        //mengembalikan nilai Prodi
        public String getProdi() {
            return Prodi;
        }

        //mengembalikan nilai listMatKul
        public ArrayList<MataKuliah> getListMatKul() {
            return listMatKul;
        }

        //mengembalikan nilai dosenWali
        public Dosen getDosenWali() {
            return dosenWali;
        }

        //mengembalikan nilai kendaraan
        public Kendaraan getKendaraan() {
            return kendaraan;
        }

        //mengeset Nim dengan parameter
        public void setNim(String Nim) {
            this.Nim = Nim;
        }
    
        //mengeset Nama dengan parameter
        public void setNama(String Nama) {
            this.Nama = Nama;
        }
    
        //mengeset Prodi dengan parameter
        public void setProdi(String Prodi) {
            this.Prodi = Prodi;
        }

        //mengeset listMatKul dengan parameter
        public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
            this.listMatKul = listMatKul;
        }

        //mengeset dosenWali dengan parameter
        public void setDosenWali(Dosen dosenWali) {
            this.dosenWali = dosenWali;
        }

        //mengeset kendaraan dengan parameter
        public void setKendaraan(Kendaraan kendaraan) {
            this.kendaraan = kendaraan;
        }
    
        //menambahkan Mata Kuliah ke dalam listMatKul
        public void addMatKul(MataKuliah newMatKul) {
            this.listMatKul.add(newMatKul);
        }
        
        //mendapatkan jumlah sks mahasiswa
        public int getJumlahSKS() {
            int jumlahSKS = 0;
            for (int i = 0; i < this.listMatKul.size(); i++) {
                jumlahSKS += this.listMatKul.get(i).getSks();
            }
            return jumlahSKS;
        }

        //mendapatkan jumlah mata kuliah mahasiswa
        public int getJumlahMatkul() {
            return this.listMatKul.size();
        }

        //menampilkan nim, nama , dan prodi mahasiswa
        public void printMhs() {
            System.out.println("NIM : " + this.Nim);
            System.out.println("Nama : " + this.Nama);
            System.out.println("Prodi : " + this.Prodi);
        }

        //mencetak detail mahasiswa
        public void printDetailMhs() {
            System.out.println("NIM : " + this.Nim);
            System.out.println("Nama : " + this.Nama);
            System.out.println("Prodi : " + this.Prodi);
            for (int i = 0; i < this.listMatKul.size(); i++) {
                System.out.println(listMatKul.get(i).getNama());
            }
            System.out.println("Dosen Wali : " + this.dosenWali.getNama());
            System.out.println("Kendaraan : " + this.kendaraan.getJenis());
        }
    }
    