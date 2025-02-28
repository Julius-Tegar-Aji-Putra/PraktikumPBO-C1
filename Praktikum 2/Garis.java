    /* Nama File   : Garis.java
    * Deskripsi   : berisi atribut dan method dalam class Garis
    * Pembuat     : Julius Tegar Aji Putra
    * Tanggal     : 19 Februari 2025
    */
    public class Garis {
        /* ATRIBUT */
        private Titik TitikAwal;
        private Titik TitikAkhir;
        private static int counterGaris = 0;

        /* METHOD */
        //konstruktor untuk membuat garis dengan titik default
        public Garis () {
            TitikAwal = new Titik();
            TitikAkhir = new Titik(1,1);
            counterGaris++;
        }

        //konstruktor untuk membuat garis dengan titik dari parameter
        public Garis (Titik TitikAwal, Titik TitikAkhir) {
            this.TitikAwal = TitikAwal;
            this.TitikAkhir = TitikAkhir;
            counterGaris++;
        }

        //mengembalikan nilai Titik Awal
        public Titik getTitikAwal () {
            return TitikAwal;
        }

        //mengembalikan nilai Titik Akhir
        public Titik getTitikAkhir () {
            return TitikAkhir;
        }

        //mengeset Titik Awal dengan parameter
        public void setTitikAwal (Titik TitikAwal) {
            this.TitikAwal = TitikAwal;
        }

        //mengeset Titik Akhir dengan parameter
        public void setTitikAkhir (Titik TitikAkhir) {
            this.TitikAkhir = TitikAkhir;
        }

        //selektor untuk atribuwt static counterGaris
        public static int getCounterGaris() {
            return counterGaris;
        }

        //mencari panjang sebuah garis
        public double getPanjang () {
            return Math.sqrt(Math.pow(getTitikAkhir().getAbsis() - getTitikAwal().getAbsis(), 2) 
                + Math.pow(getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat(), 2));
        }

        //mencari gradien sebuah garis
        public double getGradien () {
            return (getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat()) / (getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
        }

        //mencari titik tengah
        public Titik getTitikTengah () {
            return new Titik((getTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2, (getTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat()) / 2);
        }

        //mengecek apakah 2 garis sejajar
        public boolean isSejajar (Garis G2) {
            return this.getGradien() == G2.getGradien();
        }
        
        //mengecek apakah 2 garis tegak lurus
        public boolean isTegakLurus (Garis G2) {
            return this.getGradien()*G2.getGradien() == -1;
        }

        //mencetak titik awal dan titik akhir
        public void printGaris () {
            System.out.println("Titik awal: (" + getTitikAwal().getAbsis() + "," + getTitikAwal().getOrdinat() + ")");
            System.out.println("Titik akhir: (" + getTitikAkhir().getAbsis() + "," + getTitikAkhir().getOrdinat() + ")");
        }

        //mencari bentuk y = mx + c
        public void bentukGaris () {
            double m = getGradien();
            double c = getTitikAwal().getOrdinat() - m * getTitikAwal().getAbsis();
            if (c < 0) {
                System.out.println("y = " + m + "x - " + Math.abs(c));
            } else {
                System.out.println("y = " + m + "x + " + c);
            }
        }
    }




