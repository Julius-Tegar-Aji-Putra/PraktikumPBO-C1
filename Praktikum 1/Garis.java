    /* Nama File   : Garis.java
    * Deskripsi   : berisi atribut dan method dalam class Garis
    * Pembuat     : Julius Tegar Aji Putra
    * Tanggal     : 19 Februari 2025
    */
    public class Garis {
        /* ATRIBUT */
        Titik TitikAwal, TitikAkhir;
        static int counterGaris = 0;

        /* METHOD */
        //konstruktor untuk membuat garis dengan titik default
        Garis () {
            TitikAwal = new Titik();
            TitikAkhir = new Titik(1,1);
            counterGaris++;
        }

        //konstruktor untuk membuat garis dengan titik dari parameter
        Garis (Titik TitikAwal, Titik TitikAkhir) {
            this.TitikAwal = TitikAwal;
            this.TitikAkhir = TitikAkhir;
            counterGaris++;
        }

        //mengembalikan nilai Titik Awal
        Titik getTitikAwal () {
            return TitikAwal;
        }

        //mengembalikan nilai Titik Akhir
        Titik getTitikAkhir () {
            return TitikAkhir;
        }

        //mengeset Titik Awal dengan parameter
        void setTitikAwal (Titik TitikAwal) {
            this.TitikAwal = TitikAwal;
        }

        //mengeset Titik Akhir dengan parameter
        void setTitikAkhir (Titik TitikAkhir) {
            this.TitikAkhir = TitikAkhir;
        }

        //selektor untuk atribuwt static counterGaris
        static int getCounterGaris() {
            return counterGaris;
        }

        //mencari panjang sebuah garis
        double getPanjang () {
            return Math.sqrt(Math.pow(getTitikAkhir().getAbsis() - getTitikAwal().getAbsis(), 2) 
                + Math.pow(getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat(), 2));
        }

        //mencari gradien sebuah garis
        double getGradien () {
            return (getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat()) / (getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
        }

        //mencari titik tengah
        Titik getTitikTengah () {
            return new Titik((getTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2, (getTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat()) / 2);
        }

        //mengecek apakah 2 garis sejajar
        boolean isSejajar (Garis G2) {
            return this.getGradien() == G2.getGradien();
        }
        
        //mengecek apakah 2 garis tegak lurus
        boolean isTegakLurus (Garis G2) {
            return this.getGradien()*G2.getGradien() == -1;
        }

        //mencetak titik awal dan titik akhir
        void printGaris () {
            System.out.println("Titik awal: (" + getTitikAwal().getAbsis() + "," + getTitikAwal().getOrdinat() + ")");
            System.out.println("Titik akhir: (" + getTitikAkhir().getAbsis() + "," + getTitikAkhir().getOrdinat() + ")");
        }

        //mencari bentuk y = mx + c
        void bentukGaris () {
            double m = getGradien();
            double c = getTitikAwal().getOrdinat() - m * getTitikAwal().getAbsis();
            if (c < 0) {
                System.out.println("y = " + m + "x - " + Math.abs(c));
            } else {
                System.out.println("y = " + m + "x + " + c);
            }
        }
    }




