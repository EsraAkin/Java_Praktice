package day01_variables;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

        //Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen prizmanın uzun kısa kenar ve yüksekliğini giriniz: ");
        double uzun_kenar= input.nextDouble();
        double kisa_kenar= input.nextDouble();
        double yukseklik= input.nextDouble();
        
        double hacim=uzun_kenar*kisa_kenar*yukseklik;
        System.out.println("Prizmanın hacmi = " + hacim);

    }
}
