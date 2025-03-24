/**
 * File       : date.java
 * Deskripsi  : berisi atribut dan method dalam class date
 * Pembuat    : Julius Tegar Aji Putra
 * Tanggal    : 21 Maret 2025
 */

public class date {
   private int hari;
   private String bulan;
   private int tahun;

   public date(int hari, String bulan, int tahun) {
       this.hari = hari;
       this.bulan = bulan;
       this.tahun = tahun;
   }

   public int getHari(){
       return this.hari;
   }

   public String getBulan(){
       return this.bulan;
   }

   public int getTahun(){
       return this.tahun;
   }

   public static String strHari(int hari){
       switch(hari){
           case 1:
               return "01";
           case 2:
               return "02";
           case 3:
               return "03";
           case 4:
               return "04";
           case 5:
               return "05";
           case 6:
               return "06";
           case 7:
               return "07";
           case 8:
               return "08";
           case 9:
               return "09";
           case 10:
               return "10";
           case 11:
               return "11";
           case 12:
               return "12";
           case 13:
               return "13";
           case 14:
               return "14";
           case 15:
               return "15";
           case 16:
               return "16";
           case 17:
               return "17";
           case 18:
               return "18";
           case 19:
               return "19";
           case 20:
               return "20";
           case 21:
               return "21";
           case 22:
               return "22";
           case 23:
               return "23";
           case 24:
               return "24";
           case 25:
               return "25";
           case 26:
               return "26";
           case 27:
               return "27";
           case 28:
               return "28";
           case 29:
               return "29";
           case 30:
               return "30";
           case 31:
               return "31";
           default:
               return "00";
       }
   }
   
   public static int intBulan(String bulan){
       switch(bulan){
           case "Januari":
               return 1;
           case "Februari":
               return 2;
           case "Maret":
               return 3;
           case "April":
               return 4;
           case "Mei":
               return 5;
           case "Juni":
               return 6;
           case "Juli":
               return 7;
           case "Agustus":
               return 8;
           case "September":
               return 9;
           case "Oktober":
               return 10;
           case "November":
               return 11;
           case "Desember":
               return 12;
           default:
               return 0;
       }
   }

   public static String strBulan(int bulan) {
       switch(bulan) {
           case 1:
               return "Januari";
           case 2:
               return "Februari";
           case 3:
               return "Maret";
           case 4:
               return "April";
           case 5:
               return "Mei";
           case 6:
               return "Juni";
           case 7:
               return "Juli";
           case 8:
               return "Agustus";
           case 9:
               return "September";
           case 10:
               return "Oktober";
           case 11:
               return "November";
           case 12:
               return "Desember";
           default:
               return "";
       }
   }

    public static String strBulans(String bulan) {
        switch(bulan) {
            case "Januari":
                return "01";
            case "Februari":
                return "02";
            case "Maret":
                return "03";
            case "April":
                return "04";
            case "Mei":
                return "05";
            case "Juni":
                return "06";
            case "Juli":
                return "07";
            case "Agustus":
                return "08";
            case "September":
                return "09";
            case "Oktober":
                return "10";
            case "November":
                return "11";
            case "Desember":
                return "12";
            default:
                return "";
        }
    }


   public static int getJumlahHari(String bulan, int tahun) {
       int bulanint = intBulan(bulan);
       switch(bulanint) {
           case 1, 3, 5, 7, 8, 10, 12:
               return 31;
           case 4, 6, 9, 11:
               return 30;
           case 2:
               if (tahun % 4 == 0 && tahun % 100 != 0 || tahun % 400 == 0) {
                   return 29;
               } else {
                   return 28;
               }
           default:
               return 0;
       }
   }

   @Override
   public String toString(){
       return strHari(this.hari) + "-" + strBulans(this.bulan) + "-" + this.tahun;
   }
}