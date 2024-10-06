package day03;

public class Yildiz {
    public static void main(String[] args) {

        /*
           *
          * *
         *****
        *     *
       *       *
       */




        //Önce kenar boşluk sayısını bul.

        //sonra bulunduğu satır sayısı-1 yıldız koy.

        int satir=7;


        for (int bulsatir = 1; bulsatir <=satir ; bulsatir++) {
            for (int bosluk = satir-bulsatir; bosluk >=1 ; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= bulsatir*2-1; yildiz++) {
                if (yildiz==1||yildiz==bulsatir*2-1||bulsatir==satir/2+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}