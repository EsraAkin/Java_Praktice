package day03;

import day01_variables.C04_scanner;

import java.util.Random;
import java.util.Scanner;

public class Odev_5Hak {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();       //Java random sayı uretir.

        //0-100 arasinda rastgele sayı üretelim.
        int rastgeleSayi= random.nextInt(101);  //0-100 arası sayı uretir.
        System.out.println(rastgeleSayi);

        //Kullanıcının kaç kere tahmin yaptığınıtakip etmek için bir sayac oluşturalım.
        int denemeSayisi=0;

        //Kullanıcının yaptığı tahmini saklamak için bir değişken oluşturalım.
        int tahminEdilen; // int tahminEdilen=""; çalışır mıydı?

        //Kullanıcının sayıyı doğru tahmin edip edilmediğini kontrol etmek için bir boolen değişken oluşturalım.
        boolean tahminDogrumu=false;

        System.out.println("0-100 arasında bir sayı tahmin etmeye çalışın.");

            do {

                //Kullanıcıdan bir tahmin alalım
                System.out.println("Tahmininizi yapınız.");
                tahminEdilen=scanner.nextInt();

                //Sayacı 1 arttıralım
                denemeSayisi++;
                System.out.println("Kalan hak= "+(5-denemeSayisi));

                //Tahmini kontrol edelim
                if (tahminEdilen<rastgeleSayi){

                    System.out.println("Sayı daha büyük");
                }else if(tahminEdilen>rastgeleSayi){
                    System.out.println("Sayı daha küçük");
                }else {
                    tahminDogrumu=true;
                    System.out.println("Tebrikler doğru tahmin!");
                    System.out.println("Deneme sayısı: "+denemeSayisi);

                }

            }while((!tahminDogrumu)&&(denemeSayisi<5));  //Döngü doğru tahmin yapılıncaya kadar devam edecek.
            scanner.close();



    }
}
